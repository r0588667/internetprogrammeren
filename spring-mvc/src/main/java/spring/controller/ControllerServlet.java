    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.controller;

import domain.model.Movie;
import domain.printwriter.Writer;
import domain.service.MovieService;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/movie")
public class ControllerServlet {

    private final MovieService service;
    
    public ControllerServlet(@Autowired MovieService service){
       this.service = service;
    }
    /*
    public ControllerServlet(){
        service = new MovieService("Derby");
    }
    */
    @RequestMapping(value="/movieForm", method = RequestMethod.GET)
    public ModelAndView getMovieForm(){
        
        return new ModelAndView("movieForm","movie",new Movie());
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(Movie movie,BindingResult result){
        if(result.hasErrors()){
            return "movieForm";
        }
        if(service.getMovies().keySet().contains(movie.getId())){
            service.updateMovie(movie);
        }
        else {
        service.addMovie(movie);
        }
        return "redirect:/movie/movieOverview.htm";
    }
    @RequestMapping(value="/movieOverview", method = RequestMethod.GET)
    public ModelAndView getMovies(){
        ModelAndView view = new ModelAndView("movieOverview");
        view.addObject("movies",service.getMovies().values());
        view.addObject("avg",service.getAverageRating());
        return view;
    }
    @RequestMapping(value="/{id}/delete", method = RequestMethod.GET)
    public Object removeMovie(@PathVariable String id){
        int intID = Integer.parseInt(id);
        service.removeMovie(intID);
        return "redirect:/movie/movieOverview.htm";
    }
    @RequestMapping(value="/{id}/update",method = RequestMethod.GET)
    public Object updateMovie(@PathVariable String id){
        int intID = Integer.parseInt(id);
        return new ModelAndView("movieForm","movie",service.getMovie(intID));
    }
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public Object login(){
        return new ModelAndView("login");
    }
    @RequestMapping(value="/getTXT",method = RequestMethod.GET)
    @ResponseBody
    public FileSystemResource getTxt(){
        File result = Writer.writeToTXT(service.getMovies());
        return new FileSystemResource(result);
    }
    @RequestMapping(value="/getCSV",method = RequestMethod.GET)
    @ResponseBody
    public FileSystemResource getCSV(){
        File result = Writer.writeToCSV(service.getMovies());
        return new FileSystemResource(result);
    }
    /*
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public Object login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");
                return model;

	}
    	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public Object welcomePage () {
            ModelAndView view = new ModelAndView("movieOverview");
            view.addObject("movies",service.getMovies().values());
            view.addObject("avg",service.getAverageRating());
            return view;
	}
*/
}
    

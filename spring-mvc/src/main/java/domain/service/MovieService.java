/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;

import db.movie.InternalMovieDatabase;
import db.movie.MovieDatabase;
import db.movie.MovieFactory;
import domain.model.Movie;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.springframework.stereotype.Component;
/**
 *
 * @author LW
 */
@Component
public class MovieService {
    
    private MovieDatabase mdb;
    
    public MovieService(String type){
        mdb = MovieFactory.handleRequest(type);
    }
    public MovieService(){
        this("Memory");
    }
    public void addMovie(Movie movie){
        mdb.addMovie(movie);
    }
    public double getAverageRating() {
        double avg = 0.0;
        Iterator<Movie> ls = getMovies().values().iterator();
        while(ls.hasNext()){
            avg += ls.next().getRating();
        }
        avg /= getMovies().size();
        return avg;
    }
    public void removeMovie(int id){
        mdb.deleteMovie(id);
    }
    public Movie getMovie(int id){
        return mdb.getMovie(id);
        
    }
    public void updateMovie(Movie movie){
        mdb.updateMovie(movie);
    }
    public Map<Integer,Movie> getMovies(){
        return mdb.getMovies();
    }
}

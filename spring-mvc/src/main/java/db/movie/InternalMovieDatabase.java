/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.movie;

import db.*;
import domain.model.Movie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author LW
 */
public class InternalMovieDatabase implements MovieDatabase {
    
    private static HashMap<Integer,Movie> movies;

    public InternalMovieDatabase(){
        movies = new HashMap<Integer,Movie>();
        Movie a = new Movie(01,"The Last Crusader","Action", 8.1);
        Movie b = new Movie(02,"Harry Potter","Adventure", 7.1);
        movies.put(a.getId(),a);
        movies.put(b.getId(),b);
}
    @Override
    public void addMovie(Movie movie) {
      if(movie == null){
          throw new DBException("Ongeldige Film om toe te voegen");
      }
       movies.put(movie.getId(),movie);
    }

    @Override
    public void deleteMovie(int id) {
       // Iterator it = movies.keySet().iterator();
       // while (it.hasNext()){
       //     int key = (Integer) it.next();
       //     if(key == id){
                movies.remove(id);
       //     }
       // }
    }

    @Override
    public void updateMovie(Movie updatedMovie) {
       movies.replace(updatedMovie.getId(),updatedMovie);
    }

    @Override
    public Movie getMovie(int id) {
        return movies.get(id);
    }

    @Override
    public HashMap<Integer,Movie> getMovies() {
       return movies;
    }
}

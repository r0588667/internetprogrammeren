/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.movie;

import db.*;
import domain.model.Movie;
import java.util.Map;

/**
 *
 * @author LW
 */
public interface MovieDatabase {
    
    public void addMovie(Movie movie);
    public void deleteMovie(int id);
    public void updateMovie(Movie updatedMovie);
    public Movie getMovie(int id);
    public Map<Integer,Movie> getMovies();
}

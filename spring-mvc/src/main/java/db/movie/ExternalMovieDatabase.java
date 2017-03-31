/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.movie;

import db.*;
import domain.model.Movie;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ExternalMovieDatabase implements MovieDatabase {
    private Map<Integer,Movie> movies;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    public ExternalMovieDatabase(){
        movies = new HashMap<>();
    }
    public void openConnection(){
        entityManagerFactory = Persistence.createEntityManagerFactory("ip_movie");
        entityManager = entityManagerFactory.createEntityManager();
    }
    public void closeConnection(){
        try{
            entityManager.close();
            entityManagerFactory.close();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }
    @Override
    public void addMovie(Movie movie) {
        openConnection();
        entityManager.getTransaction().begin();
        entityManager.persist(movie);
        entityManager.getTransaction().commit();
        closeConnection();
    }

    @Override
    public void deleteMovie(int id) {
        openConnection();
        Movie result = entityManager.find(Movie.class, id);
        entityManager.getTransaction().begin();
        entityManager.remove(result);
        entityManager.flush();
        entityManager.getTransaction().commit();
        closeConnection();
    }

    @Override
    public void updateMovie(Movie updatedMovie) {
        
    }

    @Override
    public Movie getMovie(int id) {
        Movie result = entityManager.find(Movie.class, id);
        return result;
    }

    @Override
    public Map<Integer, Movie> getMovies() {
        openConnection();
        List<Movie> movielist = entityManager.createQuery("Select c from Movie c", Movie.class).getResultList();
        ListIterator<Movie> ls = movielist.listIterator();
        while(ls.hasNext()){
            Movie m = ls.next();
            movies.put(m.getId(),m);
        }
        closeConnection();
        return movies;
    }
    
}

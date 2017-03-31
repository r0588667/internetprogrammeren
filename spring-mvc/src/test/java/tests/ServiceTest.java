/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import domain.model.Movie;
import domain.service.MovieService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LW
 */
public class ServiceTest {
    /*
    private MovieService service;
    private Movie m = new Movie(07,"Test", "A", 9.0);
    public ServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        service = new MovieService();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void test_if_movie_is_added_to_Service_database(){
        service.addMovie(m);
        assertTrue(service.getMovies().values().contains(m));
    }
    @Test
    public void test_if_movie_is_deleted_when_name_is_given(){
        service.addMovie(m);
        service.removeMovie(m.getId());
        assertFalse((service.getMovies().values().contains(m)));
    }
    @Test
    public void test_if_movie_is_returned_when_name_is_given(){
        service.addMovie(m);
        Movie result = service.getMovie(07);
        assertEquals(result,m);
    }
    @Test
    public void test_if_average_rating_is_calculated_correctly(){
        MovieService s = new MovieService();
        s.getMovies().clear();
        Movie m = new Movie(11,"F", "A", 7.2);
        Movie z = new Movie(12,"B", "A", 8.3);
        Movie l = new Movie(13,"K", "A", 1.9);
        s.addMovie(m);
        s.addMovie(z);
        s.addMovie(l);
        double value = m.getRating() + z.getRating() + l.getRating();
        value /= s.getMovies().size();
        assertTrue(s.getAverageRating() == value);
    }
    @Test
    public void test_if_update_method_is_used_the_movies_values_are_replaced(){
        service.addMovie(m);
        Movie newMovie = new Movie(07,"Test", "Horror", 9.2);
        service.updateMovie(newMovie);
        Movie r = service.getMovie(07);
        assertTrue(r.getGenre().equals("Horror"));
    }
*/
}

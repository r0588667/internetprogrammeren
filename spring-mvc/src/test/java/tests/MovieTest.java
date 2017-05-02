/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import domain.model.DomainException;
import domain.model.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MovieTest {
    
    private Movie m;
    
    public MovieTest() {
    
    }
    
    @Before
    public void setUp() {
        m = new Movie();
    }
    
    @After
    public void tearDown() {
        m = null;
    }

    @Test
    public void test_when_valid_name_is_given_Then_movie_has_been_given_the_right_name(){
        m.setName("The Wolf Of Wall Street");
        assertEquals("The Wolf Of Wall Street",m.getName());
    }
    
    @Test (expected = DomainException.class)
    public void test_when_NULL_is_given_Then_movie_has_been_given_the_right_name(){
        m.setName(null);
    }
    
    @Test (expected = DomainException.class)
    public void test_when_empty_string_is_given_Then_movie_has_been_given_the_right_name(){
        m.setName("");
    }
    
    @Test
    public void test_when_valid_string_is_given_Then_an_exception_is_thrown(){
        m.setGenre("Comedy");
        assertEquals("Comedy",m.getGenre());
    }
    
    @Test (expected = DomainException.class)
    public void test_when_NULL_is_given_Then_an_exception_is_thrown(){
        m.setGenre(null);
    }
    
    @Test (expected = DomainException.class)
    public void test_when_empty_string_is_given_Then_an_exception_is_thrown(){
        m.setGenre("");
    }
    
    @Test
    public void test_when_low_valid_number_is_given_Then_movie_has_been_given_the_right_rating(){
        m.setRating(0.0);
        assertEquals(0.0, m.getRating(),0.0);
    }
    
    @Test
    public void test_when_high_valid_number_is_given_Then_movie_has_been_given_the_right_rating(){
        m.setRating(10.0);
        assertEquals(10.0,m.getRating(),0.0);
    }
    @Test (expected = DomainException.class)
    public void test_when_negative_number_is_given_Then_an_exception_is_thrown(){
        m.setRating(-2.3);
    }
 
    @Test
    public void test_if_toString_returns_right_format(){
       // m = new Movie(5, "ABC", "DEF", 8.2);
       // assertEquals("5 ABC DEF 8.2",m.toString());
    }
}
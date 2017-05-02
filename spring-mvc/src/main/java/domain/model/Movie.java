/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author LW
 */
@Entity
public class Movie {
    
    @Id
    @GeneratedValue
    private int id = counter;
    
    private static int counter = 1;
    @Column
    private String name;
    @Column
    private String genre;
    
    @Column
    private double rating;
    
    public Movie(){
        counter++;
    }
    public Movie(String name,String genre,double rating){
        this.setId(counter);
        this.setName(name);
        this.setGenre(genre);
        this.setRating(rating);
        counter++;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) throws DomainException {
        if(id <= 0){
            throw new DomainException("Ongeldige ID");
        }
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) throws DomainException {
        if(name == null || name.equals("") || name.isEmpty()){
            throw new DomainException("Ongeldige Naam");
        }
        this.name = name;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) throws DomainException {
         if(genre == null || genre.equals("") || genre.isEmpty()){
            throw new DomainException("Ongeldige Genre");
        }
        this.genre = genre;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating) throws DomainException {
        if(rating < 0.0 || rating > 10.0){
            throw new DomainException("Ongeldige Rating");
        }
        this.rating = rating;
    }
    @Override
    public String toString(){
        return getId()+" "+getName()+" "+getGenre()+" "+getRating();
    }
}

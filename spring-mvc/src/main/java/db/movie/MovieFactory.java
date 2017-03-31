/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.movie;

import db.*;

/**
 *
 * @author LW
 */
public class MovieFactory {
    
    public static MovieDatabase handleRequest(String type){
        MovieDatabase db = null;
        switch (type) {
            case "Memory":
                db = new InternalMovieDatabase();
                break;
            case "Derby":
                db = new ExternalMovieDatabase();
                break;
            default:
                db = new InternalMovieDatabase();
                break;
        }
        return db;
    }
}

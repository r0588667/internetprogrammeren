/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author LW
 */
public class DBException extends RuntimeException {
    
    public DBException(){
        super();
    }
    public DBException(String message){
        super(message);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.printwriter;

import domain.model.Movie;
import domain.service.MovieService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Map;
import org.apache.derby.impl.tools.sysinfo.Main;

/**
 *
 * @author LW
 */
public class Writer {
    
    
    public static File writeToTXT(Map<Integer,Movie> movies){
        File result = null;
        try{
            
        result = new File("C:\\Users\\LW\\Documents\\NetBeansProjects\\examples\\spring-mvc\\src\\main\\resources\\txt\\movies.txt");
        PrintWriter writer = new PrintWriter(result);
        for(Map.Entry<Integer,Movie> entry: movies.entrySet()){
            writer.println("|");
            Movie m = entry.getValue();
            writer.println(m.toString());
        }
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public static File writeToCSV(Map<Integer,Movie> movies){
        File result = null;
        try{
            result = new File("C:\\Users\\LW\\Documents\\NetBeansProjects\\examples\\spring-mvc\\src\\main\\resources\\txt\\movies.csv");
            PrintWriter pw = new PrintWriter(result);
            for(Map.Entry<Integer,Movie> entry: movies.entrySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(entry.getValue().getName());
            sb.append(",");
            sb.append((entry.getValue().getGenre()));
            sb.append(",");
            sb.append((entry.getValue().getRating()));
            sb.append("\n");
            pw.write(sb.toString());
            }
            pw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

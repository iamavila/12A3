/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 */
public class Polynomials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        
        
        ArrayList<PolyClass> yellah  = new ArrayList();
        
        String strin;
        String split;
        BufferedReader fin = new BufferedReader(new FileReader("polyData.txt"));
        
        strin = fin.readLine();
        int i = 0;
        
        while(strin!= null){
            yellah.add(i, new PolyClass());
            yellah.get(i).makeTerms(strin);
//            makeTerms(yellah.get(i).pLL, strin);
            
            strin = fin.readLine();// read next line
        }// make polynomial objects, creat terms
        PolyClass result = new PolyClass();
        result = AddIt(yellah.get(0), yellah.get(1));
//        yellah.get(0).makePo(); 
        
        
        
        
    }
    
    
   
       
}

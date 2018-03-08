/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3part2;

import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 */
public class PolyClass {
    
//    protected ArrayList<Integer> ThePo;
    protected PLL pLL;
     //*********************** constructor ******************
    
    public PolyClass(){
//        ThePo = null;
        pLL = new PLL();
    }
    
    //************************ Accessors***************************
    
    
    //************************* Transformers**********************
    
    
    
    public void makeTerms(String in){
    String strin;
    String[] tokens;
    String delim = "[ ,]";
    
    tokens = in.split(delim);
    
    int i = 0;
    while(i<tokens.length){
        System.out.println(tokens[i]);
        int co = Integer.parseInt(tokens[i]);
        int ex = Integer.parseInt(tokens[i+1]);
        
        Terms newT = new Terms(co, ex);
        pLL.insHead(newT);
        i+=2;
    }// end while tokens exists
} 
    
//    public void creatTerm(int co, int ex){
//        Terms newT = new Terms(co, ex);
//        
//    }
//    public void addTermTo(Terms newT){
//        pLL.addNode(newT);
//    }
}

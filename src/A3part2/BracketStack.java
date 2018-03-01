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
public class BracketStack {
        ArrayList<Object> TheS;
    
// **************** constructor *******************
    public BracketStack(){
        TheS = new ArrayList<Object>();
    }// end initialized constructor
    
//****************** accessors ****************
    protected Object peek(){// start peek
//        System.out.println("top" + TheS.get(TheS.size()-1));
        return TheS.get(TheS.size()-1); // return top element
        
    }// end peek at top element
    
    protected boolean isEmpty(){
        boolean empT = false;
        if(TheS.isEmpty() == true)
            empT = true;
        return empT;
    }// end check if empty
    
    
//***************** Transformers *******************

    protected void push(char in){
        //System.out.println("top = " + top);
        TheS.add(in);// set top of stack
        
    }// end push an element on top
    
    protected Object pop(){
        Object popper = null;
        
        if(TheS != null){
//        System.out.println("Popping " + TheS.get(TheS.size()-1));
        
        popper = TheS.get(TheS.size()-1);
//        System.out.println("Popper = " + popper);
        TheS.remove(TheS.get(TheS.size()-1));//delete top index
        
//
//        System.out.println("I am TOP" + TheS.size());
        }
        
        return popper;
    }// end pop an element off\
    

    

    
    
}// end class

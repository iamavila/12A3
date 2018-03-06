/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3part2;

/**
 *
 * @author avila-good-m
 */
public class Terms {
    
    private int co;
    private int ex;
    //*********************** constructor ******************
    
    protected Terms(int c, int e){
        co = c;
        ex = c;
    }// end create object terms
    
     //********************* accessors ***************************
    protected int getCo(){
        return co;
    }// end get coefficient
    
    protected int getEx(){
        return ex;
    }// end get exponent
    
    
}// end class

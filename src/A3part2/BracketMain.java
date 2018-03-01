package A3part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avila-good-m
 */
public class BracketMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        String strin;
        String split;
        BufferedReader fin = new BufferedReader(new FileReader("bracketData.txt"));
        
        strin = fin.readLine();
        BracketStack pbs = new BracketStack();
        
//        while(strin != null){
//            for(int i = 0; i <strin.length(); i++){
//                char f = strin.charAt(i);
//                System.out.print(f);
//            }
//            System.out.println("");
//            
//            strin = fin.readLine();
//        }
        
        int i;
        int count = 0;
        char bB;
        while(strin != null){
            i = 0;
            while(i < strin.length()){
                System.out.println("i =" + i);
                System.out.println("TheS" + pbs.TheS.size());
                
                
                
                
                bB = strin.charAt(i);
                if(pbs.isEmpty() == true || Opener(bB) == true){
                    pbs.push(bB);
                    System.out.println("pushing only\n");
                }// end if empty or open bracket
                else if(Opener(bB) == false){
                    System.out.println("comparing");
                    Compare(pbs, bB);
                    
                    //System.out.println(Compare(pbs, bB));
                }// end else if closing bracket 
                
                
                i++;// update bracket

                
                
                
                if(i>= strin.length() && pbs.isEmpty() == false){
                    System.out.println(count + " is unbalanced");
                    for(int f = 0; f < pbs.TheS.size(); f++){
                        System.out.println("remaining shit " + pbs.TheS.get(f)+ f + "count" + count);
                    }
                }
                else if(i>= strin.length() && pbs.isEmpty() ==true)
                    System.out.println("count" + count +"balanced" );
                else
                    System.out.println("just continue");
                
                
                
            }// end until reached end of string
            while(pbs.isEmpty() == false){
                pbs.pop();
                System.out.println(pbs.isEmpty());
            }
            
            System.out.println("count up");
            count++;
            strin = fin.readLine();
        }// end go through each line

        
        
        
    }
    
    public static boolean Opener(char in){
        boolean open = false;
        
        switch (in){
            case '[':
            case '{':
            case '(':
            case '<':{
                open = true;
                break;
            }
        }
        
        return open;
    }
    
    public static boolean Compare(BracketStack pb, char in){
        boolean goodly = false;
        int diff = 0;
//        for(int f = 0; f < pb.TheS.size(); f++){
//            System.out.println("remaining shit " + pb.TheS.get(f)+ f);
//        }
//        Object commpe = pb.pop();
//        System.out.println(commpe);
        char comp = (char) pb.pop();
        System.out.println("comp " + comp);
        
        switch(in){
            case ']':
            case '}':
            case '>':
                diff = 2;
                break;
            case ')':
                diff = 1;
                break;
        }   
        
            if((int)comp + diff == (int)in){
                System.out.println("diff " +diff);
                goodly = true;
            }
            else{
                pb.push(comp);
                pb.push(in);
            }
        return goodly;
    }// end compare brackets
    
}

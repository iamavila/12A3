/*
 * Trying to see if dequeueing then queueing each element, except for the 
 * n'th value, which you just dequeue.
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
public class josephus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String strin;
        String[] tokens;
        String delim = "[ ]";
        
        Object temp;
        
        BufferedReader fin = new BufferedReader(new FileReader("JqData.txt"));
        strin = fin.readLine();
//        tokens = strin.split(delim);
//        
//        int size = Integer.parseInt(tokens[1]);
//        int cutL = Integer.parseInt(tokens[0]);
        
        JosephusQueue jq = new JosephusQueue();
        
        ArrayList<Object> result = new ArrayList();
        
        while(strin!= null){
            tokens = strin.split(delim);
            int size = Integer.parseInt(tokens[1]);
            int cutL = Integer.parseInt(tokens[0]);
            
            
            makeQueue(size, jq);
            
            int count = 0;// reset count
            while(jq.TheQ.size() > 0){//start while haven't elimanted whole list
                temp = jq.TakeOffFront();// take each number off
                //System.out.println("temp " + temp);
               // System.out.println("count" + count);
                
                if(count%cutL ==0 && count >= cutL){// if to be eliminated
                    temp = result.add(temp);// add to result array
                }// end if to be eliminated
                else// else it's safe for this round
                    jq.AddToBack(temp);// add to back of queue
                                    
                count++;// update count
            }// end while list still exists
            
            System.out.println("\nSize = "+ size + "\t Elim Num = " + cutL);
            printResult(result);// print result
            
            result.clear();// reset array

            //}
            
            strin = fin.readLine();
            
        }
    }// end main
    
    
    public static void makeQueue(int size, JosephusQueue jq){
        for(int i = 0; i < size; i++){
                jq.AddToBack(i);
            }
    }
    
    public static void printResult(ArrayList<Object> array){
        for(int i = 0; i< array.size(); i++){
            System.out.print(array.get(i));
        }
    }
}// end class

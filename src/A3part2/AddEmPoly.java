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
public abstract class AddEmPoly {
    
    public PolyClass AddIt(PolyClass one, PolyClass two){
        PolyClass result = new PolyClass();
        
        String STerms = "";
        
        ArrayList<Integer> resAr = new ArrayList();
        resAr= makeResultArray(one, two);
        
        for(int i = 0; i < resAr.size(); i++){
            STerms = resAr.get(i) + "";
        }
        result.makeTerms(STerms);
        
        
        return result;
    }
    
    public ArrayList makePo(PolyClass in){
        
        Terms tempData;
        
        ArrayList<Integer> Plist = new ArrayList();
        int x;
        int c;
        
        in.pLL.traverse();
        
//        ThePo = "";

        int i = 0;
        while(in.pLL.getData(i) !=null){
            
            tempData = (Terms) in.pLL.getData(i);
            c = tempData.getCo();
            x = tempData.getEx();
            
            Plist.add(c, x);
//            System.out.println(tempData);
            i++;
        }// end while 
        
        return Plist;

    }
    
    public ArrayList makeResultArray(PolyClass one, PolyClass two){
        ArrayList<Integer> resAr = new ArrayList();
        ArrayList<Integer> oneAr = new ArrayList();
        ArrayList<Integer> twoAr = new ArrayList();
        
        oneAr = makePo(one);
        twoAr = makePo(two);
        
        int i = 0;
        while(i<oneAr.size() && i<twoAr.size()){
            
            resAr.add(i, oneAr.get(i)+ twoAr.get(i));
            
            i++;
        }// end create resultant array
        
        return resAr;
    }
    
}

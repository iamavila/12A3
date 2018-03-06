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
public class PolyClass {
    
    protected Object ThePo;
    protected PLL pLL;
     //*********************** constructor ******************
    
    public PolyClass(){
        ThePo = null;
        pLL = new PLL();
    }
    
    //************************ Accessors***************************
    
    public Object getPoly(){
        return ThePo;
    }
    
    //************************* Transformers**********************
    public void makePo(){
        int i = 0;
        Object tempData;
        
        ThePo = "";
        while(pLL.getData(i) !=null){
            tempData = pLL.getData(i);
            System.out.println(tempData);
            i++;
        }
    }
    public void wherePoly(){
        
    }
    
    
    
    
//    public void creatTerm(int co, int ex){
//        Terms newT = new Terms(co, ex);
//        
//    }
//    public void addTermTo(Terms newT){
//        pLL.addNode(newT);
//    }
}

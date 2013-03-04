/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author BlaineKillen
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public String numberTest(int number)
    {
        String message;
        
        if ((number>=0) && (number<=99) )
        {
        message = "o.k.";    
        }
        else
        {
        message = "Mistake!";
        }    
        
        return message;
    }        
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = new int[25];
        
        for(int i=0; i < numbers.length; i++)
        {
            numbers[i] = i * 5;
            
        }    
                
        
    }
}

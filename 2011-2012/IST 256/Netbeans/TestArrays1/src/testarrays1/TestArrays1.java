/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrays1;

/**
 *
 * @author BlaineKillen
 */
public class TestArrays1 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declares (and allocates) integer arrays of size 15 
        int [ ] numbers = {7, 5, 3, -4, 17, 23, 16, 2, 0, -12, 2, -1, 0, 7, 9};
        int [ ] squares = new int[15];
        
        
        // set the elements of the squares array to be the numbers 1 to 15 squared 
        for (int i = 0; i < squares.length; i++)
            {
                squares [i] = numbers [i] * numbers [i]; 
            } 
            
        // print out the all the elements of the two arrays 
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + " squared is " + squares[i]); 
        }
        
        // select an element of the array and display it
            int selectindex = 15;
            int selectedelement = numbers[selectindex]; System.out.println(); // prints a blank line 
            System.out.println("The element selected at index "+
selectindex + " is "+ selectedelement );
        
} 
    
}    


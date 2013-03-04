/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testfor;

/**
 *
 * @author BlaineKillen
 */
public class TestFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        
        // print the numbers and sums from 1 through 10
        for (int i = 1; i<12; i++)
        {
            sum = sum + i;
            System.out.println("Index is: " + i + " Sum is: " + sum);
            
        }   
        
    }
}

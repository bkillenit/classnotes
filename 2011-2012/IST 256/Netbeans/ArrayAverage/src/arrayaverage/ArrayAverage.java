/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayaverage;
import java.util.Random;
/**
 *
 * @author BlaineKillen
 */
public class ArrayAverage {

    
    /*
    * This method creates an array of random integers.
    * The random numbers are created by a Java random number generator:
    * Given an upper bound 100, the numbers are uniformly distributed between 0 and 99.
    * Parameter: sizearray specifies the number of elements of the array
    * Result: returns an array of random integers
    */
    private static int [] getRandomNumbers (int sizearray) {
    // create the array of the specified size
        int [] numberarray = new int[sizearray];
        // create the Java random number generator 
        Random randomGenerator = new Random();
        
        // for each element of the array, get the next random number 
        for (int index = 0; index < sizearray; index++)
        {
            numberarray[index] = randomGenerator.nextInt(100); 
        }
        
        return numberarray; 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = getRandomNumbers(10);
        double average, total =0;
        
        // print the array
        for (int i=0; i < numbers.length; i++)
        {
            System.out.println("number " + i + "= " + numbers[i]);
        }
        
        for (int i = 0; i<numbers.length; i++ )
        {
            total = total + numbers[i];
        }
        average = total / numbers.length;
        System.out.println(average);
        
        int maxval = 0;
        
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i]>maxval)
            {
                maxval = numbers[i];
            }
        }
        System.out.println("The maximum is " +maxval);
        
    }
}

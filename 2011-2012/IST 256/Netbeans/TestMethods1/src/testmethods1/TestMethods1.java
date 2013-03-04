/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testmethods1;



/**
 *
 * @author BlaineKillen
 */
public class TestMethods1 {
    
//method that shows passing an integer for parameter
public static int square (int y)
{
    int ysquared ;
    ysquared = y*y;
    
    return ysquared;
}

public static double cubed (double x)
{
    double xcubed;
    xcubed = x*x*x;
    
    return xcubed;
}

public static String repeatText (String text, int number)
{
    //variable to hold the repeated string
    String textOut = "";
    for (int i = 1; i <= number; i++)
    {
        textOut = textOut + text;     
    }
    
    System.out.println(textOut);
    
    return textOut;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Method Testing");
        int testnum, number_reps, resultnum;
        double cubednum, testnum2; 
        String testText, resultText;
        
        //call squareR with an integer and get a result
        testnum = 9;
        resultnum = square (testnum);
        System.out.println("the number " + testnum + 
                " squared is " + resultnum);
        
        //call repeat text
        testText = "$";
        number_reps = 10;
        resultText = repeatText (testText, number_reps);
        System.out.println("The repeated text is " + resultText);
        
        testnum2 = 2.1;
        cubednum = cubed (testnum2); 
        System.out.println("the number " + testnum2 + " cubed is " + cubednum);
    }
}

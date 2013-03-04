/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwords;

import java.io.*;

import java.util.Scanner;        

/**
 *
 * @author BlaineKillen
 */
public class FileReadWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s;
        try {
            // create a scanner to read from the text file xanadu.txt
            s = new Scanner(new BufferedReader(new FileReader("src/Resources/xanadu.txt")));

            // keep getting the next String from the text, separated by white space
            //    and print the String (a word from the file) to the output
            while( s.hasNext())  {
                    System.out.println(s.next());
            }
            
            // after all the data is read, close the file
            s.close();
        }
        catch (IOException e)   {
            // print any error messages
            System.out.println(e.toString());
            e.printStackTrace();
            System.exit(-1);
        }
        
    }
       
}


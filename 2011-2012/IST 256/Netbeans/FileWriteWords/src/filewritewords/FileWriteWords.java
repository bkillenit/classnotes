/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filewritewords;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author BlaineKillen
 */
public class FileWriteWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            BufferedReader inFile = new BufferedReader (new FileReader ("src/Resources/xanadu.txt"));
            
            BufferedWriter outFile = new BufferedWriter (new FileWriter("src/Resources/xanaduwords.txt"));
        
            Scanner s = new Scanner(inFile);
            
            String word;
            
            //process each word from the file
            while(s.hasNext())
            {
                word = s.next();
                System.out.println(word);
                outFile.write(word);
                outFile.newLine();
            }
            
            s.close();
            outFile.close();
            
        }
        catch(IOException e)
                {
                    System.out.println(e.getMessage());
                }
        
    }
}

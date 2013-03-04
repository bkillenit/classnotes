/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;

/**
 *
 * @author BlaineKillen
 */
public class Student {
 
    // variable declaration
    protected String studentname, gender;
    public int age, height;
    public DormAddress dormaddr;
    
    public Student (String studentsname, String studentsgender, int studentsage, int studentsheight, String startDorm, String startRoom)
    {
        studentname= studentsname;
        gender= studentsgender;
        age = studentsage;
        height = studentsheight;
        dormaddr = new DormAddress(startDorm, startRoom);
        
    }        
    
    public String getStudentName ()
    {
        return studentname;
    }
    
    public int getHeight()
    {
        return height;
    }        
    
    
    public int getAge()
    {
        return age;
    }        
    
    public String toString()
    {
       
       String result = "Student " + studentname + ": Gender " + gender + ": Age " + 
               age + ": Height " + height + "Address: " + dormaddr.toString();
       
       return result;
    }        
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;



/**
 *
 * @author BlaineKillen
 */
public class LocalStudent {

protected String studentname, gender;
protected int age, height;
protected String email;    
    
public LocalStudent(String _name, String _gender, int _age, int _height, String _email)    
{
studentname = _name; gender = _gender; age = _age;
height = _height; email = _email; 
}
// accessor methods
public String getStudentname () 
{
return studentname; 
}
// method to get contact information 
public String getContact ()
{
return email; 
}

}
    


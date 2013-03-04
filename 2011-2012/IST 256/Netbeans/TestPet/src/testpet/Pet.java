/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpet;

/**
 *
 * @author BlaineKillen
 */

// constructor initializes both fields



public class Pet {
    
    // fields for this class are the name and weight (in pounds) 
    public String name;
    public int weight;
    private String setPetType;
    
    
    public Pet(String startname, int startweight) {
name = startname;
weight = startweight; }
    
    public void setWeight(int newweight) 
{
weight = newweight; 
}
    
    public String setPetType(int weight)
    {
        if (weight >= 20)
        {
            setPetType = "Great Dane";
        }  
        else
        {
            setPetType = "Poodle";
        }
        
        return setPetType; 
    }
    
    public double recommendFood(String activityLevel)
{
    
    
// initialize food to 0 ounces 
double food = 0;

if (activityLevel.equals("low")) {
food = weight * 2.0; }
if (activityLevel.equals("medium")) {
food = weight * 2.2; }
if (activityLevel.equals("high")) {
food = weight * 2.4; }
return food; }
    
public String toString(String petName, int petWeight,String PetType) 
{
    String petInfo, petweight;
    
    
    petweight = String.valueOf(petWeight);
    
    petInfo = petName + ", " + petweight+ ", " + PetType; 
    
    return petInfo;
}

}

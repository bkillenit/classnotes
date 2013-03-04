/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpet;

/**
 *
 * @author BlaineKillen
 */
public class TestPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // variables for two pets 
        Pet myPet, yourPet, mySecondPet;
        String petInfo, petType; 
        
        
// amount of food 
        double amount;
// create an instance of Pet for my pet
myPet = new Pet("Tiger", 20);
// show values of my pet
System.out.println("My pet name is " + myPet.name +
" and weight is " + myPet.weight);
//create another instance of Pet for your pet 
yourPet = new Pet("Fluffy", 10);
// show values of your pet
System.out.println("Your pet name is " + yourPet.name +
" and weight is " + yourPet.weight); System.out.println();

mySecondPet = new Pet("Rosco", 19);

petType = mySecondPet.setPetType(mySecondPet.weight);

petInfo = mySecondPet.toString(mySecondPet.name,mySecondPet.weight, petType);

System.out.println ("My pet info is " + petInfo);
    
    // recommended food if my pet activity is medium
amount = myPet.recommendFood("medium"); System.out.println("With medium activity, pet food is " + amount);
// My pet loses weight
myPet.setWeight(18);
// recommended food if my pet activity is medium
amount = myPet.recommendFood("medium"); System.out.println("With medium activity, pet food is " + amount);

amount = mySecondPet.recommendFood("medium"); System.out.println("With medium activity, pet food is " + amount);

    }
}

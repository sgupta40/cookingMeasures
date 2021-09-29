import java.util.*;
/**
 * This class will implement method and constructors created in Cooking Measures
 * class. Values from the user taken in this class will be calculated using method in the Main class named CookingMeasures.
 *
 * @author Sameer Gupta
 * @version 02/12/20
 */
public class CookingMeasuresDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Creating a scanner object to ask user for values in console

        CookingMeasures cook = new CookingMeasures(); //Creating new CookingMeasrues object called cook
        
        System.out.println("Would you like to convert Cups, Teaspoons, and Tablespoons?: (Y or N) "); //Asking user if they woudl ike to proceed with the program 
        char temp = input.next().charAt(0); //Storing user inswer in variable named temp
        
        while(temp == 'Y' || temp == 'y') //Creating recurrsion while loop to keep asking user questions about thier selected variables
        {
            //Asking user what base measurment value they have
            System.out.println("What base measurment do you have? Please enter the letter(s) corresponsing to the the following -  Cups (C), Tablespoons (T), Teaspoons (N): ");
            char value = input.next().charAt(0); //Storing user response in variable value
            
            input.nextLine(); //Clearing buffer
            
            System.out.println("Pease enter the quantity value (JUST THE NUMBER...NO UNITS): "); //Asking user for amount of measurment
            double measure = input.nextDouble(); //Storing quantity in variable measure
            
            
            //IF statment assessing user response to value variable
            //using appripriate set method based on what string value contains
            if(value == 'c' || value == 'C')
            {
                cook.setCups(measure);
            }
            else if(value == 'T' || value == 't')
            {
                cook.setTablespoons(measure);
            }
            else if(value == 'N' || value == 'n')
            {
                cook.setTeaspoons(measure);
            }
            
            System.out.println(cook.toString()); //Printing data in textual format
            System.out.println(""); //Printing blank Line for asthetics
            
            System.out.println("Would you like to repeat the program: (Y or N) "); //Asking user if they would like to repeat the program
            char res = input.next().charAt(0); //Storing user response in variable res
            
            //Evalutating if user wants program to repeat
            //If so, recurrsion variable temp is set to Y 
            if(res == 'Y' || res == 'y')
            {
                temp = res;
            }
            else
            {
                temp = res;
            }
        }
        
        System.out.println("Thank You! Come Again!"); //Printing thank you note
    }
}

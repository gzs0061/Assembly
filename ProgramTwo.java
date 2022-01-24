import java.util.Scanner;
/**
*Programming exercise two week two.
*
*@author Ella Seaman - CPSC-3303
*@version 08/29/2021
*/
public class ProgramTwo {
	// constant fields
   /**
   * constructor.
   *  
   * @param args not used.
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter a  hexadecimal value: ");
      String ch;
      ch = userInput.next();
      
      try {
         System.out.println("The hex value of " + ch + " is: " 
               + Integer.valueOf(ch, 16));
      } 
      catch (Exception e) {
         System.out.println("The character " + ch + " is invalid: " 
                  + ch + " is not a bit.");
      }
      
   }
}
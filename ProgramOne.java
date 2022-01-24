import java.util.Scanner;
/**
*Programming exercise one week two.
*
*@author Ella Seaman - CPSC-3303
*@version 08/29/2021
*/
public class ProgramOne {
	// constant fields
   /**
   * constructor.
   *  
   * @param args not used.
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the binary number: ");
      String c = userInput.next();
      
      int binary = 0;
      int count = 0;
      
      for (int x = c.length() - 1; x >= 0; x--) {
      
         binary += (Integer.parseInt(String.valueOf(c.charAt(x)))) 
                  * (Math.pow(2, count));
         
         count++;
      
      }
      
      System.out.println("Decimal number: \n" + binary);
      
   }
}
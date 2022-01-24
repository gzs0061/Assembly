import java.util.Scanner;
/**
*Programming exercise three week two.
*
*@author Ella Seaman - CPSC-3303
*@version 08/29/2021
*/
public class ProgramThree {
	// constant fields
   /**
   * constructor.
   *  
   * @param args not used.
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter decimal number ");
      int decimal = userInput.nextInt();
      
      String binary = toBinary(decimal);
      
      System.out.println(binary);
      
      
   }
   /**
   * convert decimal to binary.
   *  
   * @param binary integer.
   * @return binaryStr.
   */
   public static String toBinary(int binary) {
      String binaryStr = "";
      
      while (binary != 0) {
         int bit = binary & 1;
         if (bit == 1) {
            binaryStr = "1" + binaryStr;
         }
         else {
            binaryStr = "0" + binaryStr;
         }
            
         binary = binary >>> 1;
      }
      
      return binaryStr;
   
   }   
   
}
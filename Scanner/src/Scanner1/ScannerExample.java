/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner1;
import java.util.Scanner;
/**
 *
 * @author S545694
 */
public class ScannerExample {
      // Import the Scanner class
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    //System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    double answer = myObj.nextDouble();
    System.out.println("answer is: " + answer);
  }
}
    

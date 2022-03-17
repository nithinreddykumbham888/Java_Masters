/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class RemoveCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String choice = scan.nextLine();
        System.out.println("Enter a character to remove in string : ");
        char choice1 = scan.next().charAt(0);
        char[] array = new char[choice.length()];
        char[] array1 = choice.toCharArray();
        for(int i=0;i<array1.length;i++){
            if(array1[i] !=choice1 ){
                array[i] = array1[i]; 
            }
        }
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]);
        }
    }
    
}

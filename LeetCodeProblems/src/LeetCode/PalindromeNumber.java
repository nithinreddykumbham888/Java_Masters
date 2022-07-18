/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author S545694
 * 
 * Given an integer x, return true if x is palindrome integer.

   An integer is a palindrome when it reads the same backward as forward.

   For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num = scan.nextInt();
        //System.out.println(num);
        PalindromeNumber test = new PalindromeNumber();
        boolean finalOutput = test.isPalindrome(num);
        System.out.println(finalOutput);
    }
    
    public boolean isPalindrome(int num){
        ArrayList<Integer> a1 = new ArrayList<>();
        int finalOutput1 = 0,num1 = 0,output = 0,num2 = num,k=0;
        while(num>0){
             int rem = num%10;
             a1.add(rem);
             num = num/10;
        }
        for(int i=a1.size()-1;i>=0;i--){
            num1 = a1.get(i);
            System.out.println(num1);
            output = (int) (num1 * Math.pow(10, k++));
            finalOutput1 = finalOutput1 + output;
        }
        boolean returnResult = (finalOutput1 == num2);
        return returnResult;
    }
    
}

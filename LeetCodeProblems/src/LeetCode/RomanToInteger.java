/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author S545694
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
 * 
 */
public class RomanToInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Roman string to be converted : ");
        String input = scan.next();
        RomanToInteger rti = new RomanToInteger();
        int numericalValue = rti.romanToInt(input);
        System.out.println(numericalValue);
    }
    public int romanToInt(String input){
        char[] array = input.toCharArray();
        int integerValue = 0,value =0;
        for(int i=0;i<array.length;i++){
            if(array[i] == 'I'||array[i] =='V'||array[i] =='X'||array[i] =='L'||array[i] =='C'||array[i] =='D'||array[i] =='M'){
                //System.out.println("Input Matches");
                if(array[i]=='I'){
                    value = 1;
                }
                if(array[i]=='V'){
                    value = 5;
                }
                if(array[i]=='X'){
                    value = 10;
                }
                if(array[i]=='L'){
                    value = 50;
                }
                if(array[i]=='C'){
                    value = 100;
                }
                if(array[i]=='D'){
                    value = 500;
                }
                if(array[i]=='M'){
                    value = 1000;
                }
                integerValue = integerValue + value;
            }
            else{
                System.out.println("Input doesn't match, Please consider the input provided");
            break;
            }
        }
          
            return integerValue;
        }
    
}

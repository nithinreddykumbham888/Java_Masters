/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class FindingNearestColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 24-bit binary string : "); //000000001111111100000110
        String input = scan.next();
        int in1 = 8, in2 = 16, in3 = 24;
        ArrayList<Integer> elements = new ArrayList<>();
        char[] array1 = input.toCharArray();
        //System.out.println("size : "+array1.length);
        for(int i=0;i<in1;i++){
            elements.add(Character.getNumericValue(array1[i]));
        }
       // System.out.println(elements);
       int red = 0;
       int first = 0;
       for(int i=elements.size()-1;i>=0;i--){
          int result = (int) Math.pow(2, first);
          red = red + (result * elements.get(i));
          first++;
       }
        System.out.println(red);
        elements.clear();
        for(int i=in1;i<in2;i++){
            elements.add(Character.getNumericValue(array1[i]));
        }
        int green = 0;
       int second = 0;
       for(int i=elements.size()-1;i>=0;i--){
          int result = (int) Math.pow(2, second);
          green = green + (result * elements.get(i));
          second++;
       }
        System.out.println(green);
        elements.clear();
        for(int i=in2;i<in3;i++){
            elements.add(Character.getNumericValue(array1[i]));
        }
        int blue = 0;
       int third = 0;
       for(int i=elements.size()-1;i>=0;i--){
          int result = (int) Math.pow(2, third);
          blue = blue + (result * elements.get(i));
          third++;
       }
        System.out.println(blue);
        double pureBlack =0,pureWhite = 0, pureRed = 0, pureGreen = 0, pureBlue = 0;
        pureBlack = Math.sqrt(((int) Math.pow((red-0), 2)) + ((int) Math.pow((green-0), 2)) + ((int) Math.pow((blue-0), 2)));
         double scale = Math.pow(10, 7);
         pureBlack = Math.round(pureBlack*scale)/scale;
         System.out.println(pureBlack);
    }
    
}

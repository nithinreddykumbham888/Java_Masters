/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LeetCode;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class LongestSubstring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scan.next();
        LongestSubstring test = new LongestSubstring();
        int length = test.lengthOfLongestSubstring(input);
        System.out.println(length);
    }
    
    public int lengthOfLongestSubstring(String s){
        Set<Character> enter = new LinkedHashSet<>();
        char[] ch = s.toCharArray();
        int count = 1;
        for(int i=0;i<ch.length;i++){
            enter.add(ch[i]);
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] != ch[j]){
                    
                }
            }
        }
        return 0;
    }
    
}

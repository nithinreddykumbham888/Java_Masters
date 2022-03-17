/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class TwoSum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements of choice in Int : ");
        int choice = scan.nextInt();
        int[] array = new int[choice];
        System.out.println("Enter elements with space : ");
        for(int i=0;i<choice;i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter target : ");
        int target = scan.nextInt();
        TwoSum test = new TwoSum();
        int[] array3 = test.getOutput(array,target);
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }
    }
    
    public int[] getOutput(int[] array, int target){
        ArrayList<Integer> output1 = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] + array[j] == target){
                    output1.add(i);
                    output1.add(j);
                }
            }
        }
        int[] output = new int[output1.size()];
        for(int i=0;i<output1.size();i++){
            output[i] = output1.get(i);
        }
        return output;
    }
}

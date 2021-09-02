/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author Nithin_Reddy_Kumbham
 */
public class StringAndNumbers {
    public static void main(String args[]) {
        String string1="    Welcome  ";
        String string2=" to ";
        String string3="    the first  ";
        String string4=" Lab Activity";
        String string5="   in the ";
        String string6=" OOP Course ";
        System.out.println(string1.concat(string2).concat(string3).concat(string4).concat(string5).concat(string6));
        int a = string1.length();
        int b = string2.length();
        int c = string3.length();
        int d = string4.length();
        int e = string5.length();
        int f = string6.length();
        int totalLength = a+b+c+d+e+f;
        System.out.println("The length of the concatenated string is: " + totalLength);
        System.out.println(string1.trim() + ' ' + string2.trim() + ' ' + string3.trim() + ' ' + string4.trim() + ' ' + string5.trim() + ' ' + string6.trim() + "!");
        String string7 = string1.trim() + ' ' + string2.trim() + ' ' + string3.trim() + ' ' + string4.trim() + ' ' + string5.trim() + ' ' + string6.trim() + "!" ;
        int g = string7.length();
        System.out.println("Length of the above string is: " + g);
        /**
          *      System.out.println("Retrieved:" + string7.indexOf("Lab Activity"));
          *     System.out.println("Retrieved:" + string7.indexOf("in"));
          */
        System.out.println("Retrieved: " + string7.substring(21,33));
        String string8 = string7.substring(21,33).toUpperCase();
        System.out.println("Index of first I in 'LAB ACTIVITY' is at: " + string8.indexOf("I"));
        
        
        String string9 = "lab intresting activities are activities lab  Intresting Lab Activities Are Intresting Lab activities Lab Intresting";
        System.out.println("First occurance of Intresting is at: " +string9.indexOf("Intresting"));
        String string10 = "Object-Oriented-Programming 44542";
        System.out.println(string10);
        String string11= string10.replace('-','_');
        System.out.println(string11.replace(" ","-"));
        String string12= "Computer";
        String string13= "Science";
        String string13a= string13.toUpperCase();
        String string14= string12.concat(string13a);
        int lengthOfSt12= string12.length();
        int lengthOfSt13= string13.length();
        System.out.println("The ID is: " + string14.substring(0,4) + string14.substring(8,11) + lengthOfSt12 + lengthOfSt13);
        System.out.println("Why do you choose Applied Computer Science ? " + '\n' +"I wanna get deep exposure into advanced concepts in CS where I will be landing in a good position in top companies.");
        
        /**
      * Math Class Concepts
      */
       int value1 = 9;
       int value2 = 13;
       System.out.println(Math.sqrt(Math.pow(value1,2)+ Math.pow(value2,2)));
       System.out.println("exp (9): " +Math.exp(value1));
       double number1 = 1/Math.cos(value1);
       System.out.println("sec (9): " +number1);
       int myNumber = 27;
       double myNumberResult = Math.cbrt(myNumber);
       System.out.println("Cube root of 27.00: " + myNumberResult);
       System.out.println("Logarithm value is: " +Math.log(myNumber));
       double result1 = Math.tan(60)-Math.tan(45);
       double result2 = 1+(Math.tan(60)*Math.tan(45));
       System.out.println("tan 60 - tan 45 / (1 + tan 60 tan 45) = " +result1/result2);
       double result3 = Math.tan(90);
       System.out.println("Theoretical value of tan (90) is: " + result3);
       double result4 = Math.cbrt(result3);
       System.out.println("Cubic root of modulus value of tan (90) is: " +Math.abs(result4));
       double result5 = 1/(Math.sin(30));
       double result6 = 1/(Math.cos(30));
       System.out.println("Cosecant of 30 is: " + result5);
       System.out.println("Secant of 30 is: " + result6);
       System.out.println("Minimum value in Cosec (30) and Sec (30) is: " + Math.min(result5,result6));
       System.out.println("Maximum value in Cosec (30) and Sec (30) is: " + Math.max(result5,result6));
       int myNumber1 = 45;
       int myNumber2 = 27;
       double result7 = Math.cos(myNumber1);
       double result8 = Math.cos(myNumber2);
       double result9 = Math.tan(myNumber1);
       double result10 = Math.tan(myNumber2);
       System.out.println("Rounded value of cos 45: " + Math.round(result7));
       System.out.println("Rounded value of cos 27: " + Math.round(result8));
       System.out.println("Rounded value of tan 45: " + Math.round(result9));
       System.out.println("Rounded value of tan 27: " + Math.round(result10));
       double result11 = Math.cos(myNumber2);
       double result12 = 8*result11;
       double result13 = Math.abs(result12);
       double result14 = Math.pow(7,4);
       double result15 = 8*6*7;
       double result16 = result14 + result15 * 5;
       double x = 1;
       double y = 4;
       double z = x/y;
       //System.out.println("value: " + z);
       double result17 = Math.pow(result16,z);
       double result18 = Math.pow(5,2);
       double result19 = Math.pow(3,2);
       double result20 = result18 - result19;
       double xx = 1;
       double yy = 8;
       double zz = xx/yy;
       double result21 = Math.pow(result20,zz);
       double result22 = result17/result21;
       System.out.println("The Value of given equation is: " +result13*result22);
       
       
         /**
      * Math Class Concepts
      */
         Random RNo = new Random();
         System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
             int randomInt1 = (int)(200.0 * Math.random());
             int randomInt2 = (int)(200.0 * Math.random());
             int randomInt3 = (int)(200.0 * Math.random());
             int randomInt4 = (int)(200.0 * Math.random());
             System.out.println("First random integer value is: " + randomInt1 + " Square of "+randomInt1+" is: " +(int)Math.pow(randomInt1, 2));
             System.out.println("Second random integer value is: " + randomInt2 + " Square of "+randomInt2+" is: " +(int)Math.pow(randomInt2, 2));
             System.out.println("Third random integer value is: " + randomInt3 + " Square of "+randomInt3+" is: " +(int)Math.pow(randomInt3, 2));
             System.out.println("Fourth random integer value is: " + randomInt4 + " Square of "+randomInt4+" is: " +(int)Math.pow(randomInt4, 2));
         int randomInt5 = RNo.nextInt();
         int randomInt6 = RNo.nextInt();
         int randomInt7 = RNo.nextInt();
         System.out.println("3 pseudo-random integer values without seed value and bounds");
         System.out.println("Fifth random integer value is: " + randomInt5);
         System.out.println("Sixth random integer value is: " + randomInt6);
         System.out.println("Seventh random integer value is: " + randomInt7);
         System.out.println("The ouput is different when multiple run's is performed.");
         int s = 30;
         RNo.setSeed(s);
         System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
             int randomInt8 = (int)(200.0 * Math.random());
             int randomInt9 = (int)(200.0 * Math.random());
             int randomInt10 = (int)(200.0 * Math.random());
             int randomInt11 = (int)(200.0 * Math.random());
             System.out.println("First random integer value is: " + randomInt8 + " Square of "+randomInt8+" is: " +(int)Math.pow(randomInt8, 2));
             System.out.println("Second random integer value is: " + randomInt9 + " Square of "+randomInt9+" is: " +(int)Math.pow(randomInt9, 2));
             System.out.println("Third random integer value is: " + randomInt10 + " Square of "+randomInt10+" is: " +(int)Math.pow(randomInt10, 2));
             System.out.println("Fourth random integer value is: " + randomInt11 + " Square of "+randomInt11+" is: " +(int)Math.pow(randomInt11, 2));
         int randomInt12 = RNo.nextInt();
         int randomInt13 = RNo.nextInt();
         int randomInt14 = RNo.nextInt();
         System.out.println("3 pseudo-random integer values with seed value and without bounds");
         System.out.println("Fifth random integer value is: " + randomInt12);
         System.out.println("Sixth random integer value is: " + randomInt13);
         System.out.println("Seventh random integer value is: " + randomInt14);
         System.out.println("The ouput is same when multiple run's is performed." + " i.e -1153176083, 933071736, 958937531");
         System.out.println("The main difference between non seed value and with seed value is: " +"\n" + "In non seed value the outputs are changing everytime when the program is runned and whereas in seeded value the outputs semains the same.");
    }
     
    
}

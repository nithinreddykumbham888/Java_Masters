/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545694
 */
// Default Constructor
public class Student {
    private String name;
    private int rollNo;
    private char gender;
    public Student(){
              this.name = "Nithin";
              this.rollNo = 88;
              this.gender = 'M';
}
    public static void main(String args[]){
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
       System.out.println(s1.gender);
    
   }
}

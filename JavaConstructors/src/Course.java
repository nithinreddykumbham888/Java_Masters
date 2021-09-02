/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545694
 */
// parameterized Constructor
public class Course {
    public String CourseName;
    public int CourseDuration;
    public boolean Scope;
    Course(String str,int n,boolean t){
        CourseName = str;
        CourseDuration = n;
        Scope = t;
    }
    public static void main(String args[]){
        Course C1 = new Course("Applied Computer Science",4,true);
        System.out.println(C1.CourseName);
        System.out.println(C1.CourseDuration);
        System.out.println(C1.Scope);
        
    }
    
}

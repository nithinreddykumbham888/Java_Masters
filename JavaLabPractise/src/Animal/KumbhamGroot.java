/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;
import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class KumbhamGroot {
    String name;
    int age;
    double height;
    double weight;
    String fName;
    String mName;
    boolean miracleChild;
    
    public KumbhamGroot(String name1,int age1,double height1,double weight1,String fName1,String mName1,boolean miracleChild1){
        name = name1;
        age = age1;
        height = height1;
        weight = weight1;
        fName = fName1;
        mName = mName1;
        miracleChild = miracleChild1;
    }
    public KumbhamGroot(){}
     //Setter's
    public void setname(String name1){   
        name = name1;
    }
    public void setage(int age1){
        age = age1;
    }
    public void setheight(double height1){
        height = height1;
    }
    public void setweight(double weight1){
        weight = weight1;
    }
    public void setfName(String fName1){
        fName = fName1;
    }
    public void setmName(String mName1){
        mName = mName1;
    }
    public void setmiracleChild(boolean miracleChild1){
        miracleChild = miracleChild1;
    }
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter height: ");
        double height = scan.nextDouble();
        System.out.println("Enter weight: ");
        double weight = scan.nextDouble();
        System.out.println("Enter fName: ");
        String fName = scan.next();
        System.out.println("Enter mName: ");
        String mName = scan.next();
        System.out.println("Is miracle child: ");
        boolean miracleChild = scan.nextBoolean();
        KumbhamGroot hello = new KumbhamGroot();
        hello.setname("Nithin");
        hello.setage(23);
        hello.setheight(5.7);
        hello.setweight(43.6);
        hello.setfName("Vasu");
        hello.setmName("Manjula");
        hello.setmiracleChild(true);
        System.out.println("Name is: "+hello.name);
        System.out.println("Age is: "+hello.age);
        System.out.println("Height is: "+hello.height);
        System.out.println("Weight is: "+hello.weight);
        System.out.println("fName is: "+hello.fName);
        System.out.println("mName is: "+hello.mName);
        System.out.println("ismiracleChild: "+hello.miracleChild);
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Height is: "+height);
        System.out.println("Weight is: "+weight);
        System.out.println("fName is: "+fName);
        System.out.println("mName is: "+mName);
        System.out.println("ismiracleChild: "+miracleChild);
    }
    
}
/**String name = "babygroot";
        System.out.println("Name is: "+name);
        int age=6;
        System.out.println("Age is: "+age);
        double height=3.5;
        System.out.println("Height is: "+height);
        String fName="Searels";
        System.out.println("Fname is: "+fName);
        boolean miracleChild=true;
        System.out.println("ismiraclechild is: "+miracleChild);
        * public String getname(){
        * return name;
        * }
        */
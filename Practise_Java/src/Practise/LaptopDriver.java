/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class LaptopDriver {

    
    public static void main(String[] args) {
        Laptop Object1 = new Laptop("HP","Intel Core I5",12.4,512,"Windows",true);
        System.out.println("*Testing getter method on Object1*");
        System.out.println("laptop Brand is: "+Object1.getlaptopBrand());   
        System.out.println("Name of the Processor is: "+Object1.getProcessor());
        System.out.println("Operating System Name: "+Object1.getoperatingSystem());
        System.out.println("Hard Drive capacity in GB's: "+Object1.gethardDrive());
        System.out.println("Screen Size: "+Object1.getdisplay());
        System.out.println("is Touch: "+Object1.gettouch());
        System.out.println("*Testing toString method on Object1*"+"\n"+Object1.toString());
        Laptop Object2 = new Laptop();
        System.out.println("*Testing toString method on Object2*"+"\n"+Object2.toString());
        Object2.setlaptopBrand("Apple");
        Object2.setProcessor("Intel core I3");
        Object2.setoperatingSystem("macOS Mojave");
        Object2.sethardDrive(256);
        Object2.setdisplay(10.5);
        Object2.settouch(false);
        System.out.println("*Testing toString method on Object2*"+"\n"+Object2.toString());
        System.out.println("*Testing getter method on Object2*");
        System.out.println("laptop Brand is: "+Object2.getlaptopBrand());   
        System.out.println("Name of the Processor is: "+Object2.getProcessor());
        System.out.println("Operating System Name: "+Object2.getoperatingSystem());
        System.out.println("Hard Drive capacity in GB's: "+Object2.gethardDrive());
        System.out.println("Screen Size: "+Object2.getdisplay());
        System.out.println("is Touch: "+Object2.gettouch());
    }
    
}

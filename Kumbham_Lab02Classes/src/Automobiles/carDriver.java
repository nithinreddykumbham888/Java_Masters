/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automobiles;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class carDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car Object1 = new Car("Golf","Volkswagen","Red",28.0,33.0,2020,false);
        Object1.setcarModel("Golf");
        Object1.setcarManufacturer("Volkswagen");
        Object1.setcolor("Red");
        Object1.setmileage(28.0);
        Object1.setspeed(33.0);
        Object1.setyearofManfacturer(2020);
        Object1.setisElectric(false);
        System.out.println("*****Testing getter method on object1*********");
        System.out.println("Car Model is :"+Object1.getcarModel());
        System.out.println("Name of the manufacturer is :"+Object1.getcarManufacturer());
        System.out.println("Color of the car is :"+Object1.getcolor());
        System.out.println("Year of manufacturig is :"+Object1.getyearofManfacturer());
        System.out.println("Speed of the car per miles/hour is :"+Object1.getspeed());
        System.out.println("Mileage of car is :"+Object1.getmileage());
        System.out.println("The car is electric(True/False) is :"+Object1.getisElectric());
        System.out.println("*****Testing toString method on object1*********");
        System.out.println(Object1.toString());
        Car Object2 = new Car("Passat","Blue","Volkswagen");
        Object2.setcarModel("Passat");
        Object2.setcolor("Blue");
        Object2.setcarManufacturer("Volkswagen");
        System.out.println("*****Testing constructor with three parameters and Invoking toString method*********");
        System.out.println(Object2.toString());
        System.out.println("*****Testing getter method on object2*********");
        System.out.println("Car Model is :"+Object2.getcarModel());
        System.out.println("Name of the manufacturer is :"+Object2.getcarManufacturer());
        System.out.println("Color of the car is :"+Object2.getcolor());
        System.out.println("Year of manufacturig is :"+Object2.getyearofManfacturer());
        System.out.println("Speed of the car per miles/hour is :"+Object2.getspeed());
        System.out.println("Mileage of car is :"+Object2.getmileage());
        System.out.println("The car is electric(True/False) is :"+Object2.getisElectric());
        Car Object3 = new Car("Swift","Yellow","Maruthi",18.0,25.0,2021,true);
        System.out.println("*****Testing toString on object 3*********");
        Object3.setcarModel("Swift");
        Object3.setcolor("Yellow");
        Object3.setcarManufacturer("Maruthi");
        Object3.setmileage(18.0);
        Object3.setspeed(25.0);
        Object3.setyearofManfacturer(2021);
        Object3.setisElectric(true);
        System.out.println(Object3.toString());
    }
    
}

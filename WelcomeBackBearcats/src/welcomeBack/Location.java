/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcomeBack;

import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class Location {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the place : ");
        String place = scan.next();
        System.out.println("Enter your house name : ");
        String house = scan.next();
        System.out.println("Enter where you worked : ");
        String placeOfWork = scan.next();
        System.out.println("Enter the hourly pay : ");
        double pay = scan.nextDouble();
        System.out.println("Enter the hours you worked : ");
        int hours = scan.nextInt();
        California cali = new California(place,house,placeOfWork,pay,hours);
        System.out.println("place : "+cali.getPlace());
        System.out.println("house : "+cali.getHouseAddress());
        System.out.println("locationOfWork : "+cali.getPlaceOfWork());
        System.out.println("pay : "+cali.getPay());
        System.out.println("hours worked : "+cali.getHoursWorked());
        cali.setPay(13.0);
        System.out.println("pay : "+cali.getPay());
        System.out.println(""+cali.toString());
        System.out.println("Total amount you got :$ "+cali.totalAmount(pay, hours));
    }
    
}

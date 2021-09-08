/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

import java.util.Scanner;
/**
 *
 * @author Nithin Reddy Kumbham
 */
public class EmployeeSalaryDriver {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Testing the EmployeeSalary class: ");
        System.out.println("Enter the hourly pay rate of the Employee: "); 
        double hourlyRate = scan.nextDouble();
        System.out.println("Enter the insurance rate of the Employee in percentage: ");
        double insuranceRate = scan.nextDouble();
        System.out.println("Enter the tax rate of the Employee in percentage: ");
        double taxRate = scan.nextDouble();
        System.out.println("Enter the pf rate of the Employee in percentage: ");
        double pfRate = scan.nextDouble();
        System.out.println("Enter the bonus of the Employee: ");
        double bonus = scan.nextDouble();
        EmployeeSalary empSalObj1 = new EmployeeSalary(hourlyRate,insuranceRate,taxRate,pfRate);
        System.out.println("The details of empSalObj1 object are as follows: \n"+empSalObj1.toString());
        System.out.println("The monthly salary of the Employee is: $"+empSalObj1.calcMonthlySalary(EmployeeSalary.HOURS,empSalObj1.gethourlyRate()));
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj1.calcMonthlyInsurance(EmployeeSalary.HOURS,empSalObj1.gethourlyRate(),empSalObj1.getinsuranceRate()));
        System.out.println("The monthly pf of the Employee is: $"+empSalObj1.calcMonthlypfAmount(EmployeeSalary.HOURS,empSalObj1.gethourlyRate(),empSalObj1.getpfRate()));
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj1.calcAnnualGrossSalary(EmployeeSalary.HOURS,empSalObj1.gethourlyRate(),bonus));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj1.calcAnnualNetPay(bonus));
        System.out.println("**************************************************");
        EmployeeSalary empSalObj2 = new EmployeeSalary();
        System.out.println("The details of empSalObj2 object are as follows: \n"+empSalObj2.toString());
        System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary(EmployeeSalary.HOURS, empSalObj2.gethourlyRate()));
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),empSalObj2.getinsuranceRate()));
        System.out.println("The monthly pf of the Employee is: $"+empSalObj2.calcMonthlypfAmount(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),empSalObj2.getpfRate()));
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),bonus));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(bonus));
        empSalObj2.sethourlyRate(35.0);
        empSalObj2.setinsuranceRate(12.50);
        empSalObj2.setpfRate(10.5);
        empSalObj2.settaxRate(11.45);
        System.out.println("Enter the new bonus of the Employee: ");
        double bonus1 = scan.nextDouble();
        System.out.println("The details of empSalObj2 object are as follows: \n"+empSalObj2.toString());
        System.out.println("The monthly salary of the Employee is: $"+empSalObj2.calcMonthlySalary(EmployeeSalary.HOURS, empSalObj2.gethourlyRate()));
        System.out.println("The monthly insurance of the Employee is: $"+empSalObj2.calcMonthlyInsurance(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),empSalObj2.getinsuranceRate()));
        System.out.println("The monthly pf of the Employee is: $"+empSalObj2.calcMonthlypfAmount(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),empSalObj2.getpfRate()));
        System.out.println("The annual gross salary of the Employee is: $"+empSalObj2.calcAnnualGrossSalary(EmployeeSalary.HOURS,empSalObj2.gethourlyRate(),bonus1));
        System.out.println("The gross annual net pay of the Employee is: $"+empSalObj2.calcAnnualNetPay(bonus1));
    }
    
}

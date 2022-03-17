/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;


/**
 *
 * @author Nithin Reddy Kumbham
 */
public class EmployeeSalary {
    private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private double pfRate;
     static final int HOURS =40;
    /**
     * This is a parameterized constructor for EmployeeSalary
     * @param hourlyRate1
     * @param insuranceRate1
     * @param taxRate1
     * @param pfRate1 
     */
    public EmployeeSalary(double hourlyRate1, double insuranceRate1, double taxRate1, double pfRate1){
        hourlyRate = hourlyRate1;
        insuranceRate = insuranceRate1;
        taxRate = taxRate1;
        pfRate = pfRate1;
    }
    /**
     * This is a no arg constructor
     */
    public EmployeeSalary(){} 
    
    //Getter's
    public double gethourlyRate(){
        return hourlyRate;
    }
    
    public double getinsuranceRate(){
        return insuranceRate;
    }
    
    public double gettaxRate(){
        return taxRate;
    }
    
    public double getpfRate(){
        return pfRate;
    }
    
    
    //Setter's
      public void sethourlyRate(double hourlyRate){
    this.hourlyRate = hourlyRate;
  }
      public void setinsuranceRate(double insuranceRate1){
    insuranceRate = insuranceRate1;
  }
      public void settaxRate(double taxRate1){
    taxRate = taxRate1;
  }
      public void setpfRate(double pfRate1){
    pfRate = pfRate1;
  }
      
      /**
       * Calculates MonthlySalary of the employee
       * @param HOURS1
       * @param hourlyRate1
       * @return MonthlySalary
       */
      public static double calcMonthlySalary(int HOURS1,double hourlyRate1){
          double wage = HOURS1 * hourlyRate1;
          return wage * 4;
      }
      
      /**
       * Calculates MonthlyInsurance of the employee
       * @param HOURS1
       * @param hourlyRate1
       * @param insuranceRate1
       * @return MonthlyInsurance
       */
      public static double calcMonthlyInsurance(int HOURS1,double hourlyRate1,double insuranceRate1){
          double wage = HOURS1 * hourlyRate1;
          double monthlySalary = wage * 4;
          return (monthlySalary * insuranceRate1)/100;
      }
       
      /**
       * Calculates MonthlypfAmount of the employee
       * @param HOURS1
       * @param hourlyRate1
       * @param pfRate1
       * @return MonthlypfAmount
       */
       public static double calcMonthlypfAmount(int HOURS1,double hourlyRate1,double pfRate1){
          double wage = HOURS1 * hourlyRate1;
          double monthlySalary = wage * 4;
          return (monthlySalary * pfRate1)/100;
      }
       
        /**
         * Calculates AnnualGrossSalary of the employee
         * @param HOURS1
         * @param hourlyRate1
         * @param bonous
         * @return AnnualGrossSalary
         */
       public static double calcAnnualGrossSalary(int HOURS1,double hourlyRate1,double bonous){
          double wage = HOURS1 * hourlyRate1;
          double monthlySalary = wage * 4;
          double annualSalary = monthlySalary*12;
          return bonous + annualSalary;
      }
       
       /**
        * Calculates AnnualNetPay of the employee
        * @param bonous
        * @return AnnualNetPay
        */
       public  double calcAnnualNetPay(double bonous){
          double annualInsurance = calcMonthlyInsurance(HOURS, hourlyRate, insuranceRate)*12;
          double annualpfAmount = calcMonthlypfAmount(HOURS, hourlyRate, pfRate)*12;
          return calcAnnualGrossSalary(HOURS,hourlyRate, bonous)-(calcAnnualGrossSalary(HOURS,hourlyRate, bonous)*taxRate/100.0)-annualInsurance-annualpfAmount;
      }
       
    @Override
       public String toString(){
           return "hourlyRate: "+hourlyRate+","+" insuranceRate: "+insuranceRate+","+" taxRate: "+taxRate+","+" pfRate: "+pfRate+","+" HOURS: "+HOURS;
       }
}
     /*private double hourlyRate;
    private double insuranceRate;
    private double taxRate;
    private double pfRate;
    private int HOURS;
   */
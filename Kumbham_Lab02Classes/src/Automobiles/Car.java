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
public class Car {
    private String carModel;
    private String carManufacturer;
    private String color;
    private double mileage;
    private double speed;
    private int yearofManfacturer;
    private boolean isElectric;
    /**
     * Creating a constructor
     * @param carModel1
     * @param carManufacturer1
     * @param color1
     * @param mileage1
     * @param speed1
     * @param yearofManfacturer1
     * @param isElectric1 
     */
    public Car(String carModel1, String carManufacturer1, String color1, double mileage1, double speed1, int yearofManfacturer1, boolean isElectric1){
        carModel = carModel1;
        carManufacturer = carManufacturer1;
        color = color1;
        mileage = mileage1;
        speed = speed1;
        yearofManfacturer = yearofManfacturer1;
        isElectric = isElectric1;
    }
    public Car(){   // This is an emprty constructor
    }
    public Car(String carModel1, String color1, String carManufacturer1){
        carModel = carModel1;
        color = color1;
        carManufacturer = carManufacturer1;
    }
    // Getter's
    public String getcarModel() {
    return carModel;
  }
     public String getcarManufacturer() {
    return carManufacturer;
  }
     public String getcolor() {
    return color;
  }
     public double getmileage() {
    return mileage;
  }
     public double getspeed() {
    return speed;
  }
    public boolean getisElectric() {
    return isElectric;
  }
    public int getyearofManfacturer() {
    return yearofManfacturer;
  }
    // Setter's
    public void setcarModel(String carModel1) {
    carModel = carModel1;
  }
    public void setcarManufacturer(String carManufacturer1) {
    carManufacturer = carManufacturer1;
  }
    public void setcolor(String color1) {
    color = color1;
  }
    public void setmileage(double mileage1) {
    mileage = mileage1;
  }
    public void setspeed(double speed1) {
    speed = speed1;
  }
    public void setyearofManfacturer(int yearofManfacturer1) {
    yearofManfacturer = yearofManfacturer1;
  }
    public void setisElectric(boolean isElectric1) {
    isElectric = isElectric1;
  }
     

    @Override
    public String toString() {
        return "CarModel="+carModel+"\n"+"Color="+color+"\n"+"CarManufacturer="+carManufacturer+"\n"+"YearofManufacturer="+yearofManfacturer+"\n"+"Speed="+speed+"\n"+"Mileage="+mileage+"\n"+"isElectric="+isElectric; //To change body of generated methods, choose Tools | Templates.
    }

    //void setisElectric(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}

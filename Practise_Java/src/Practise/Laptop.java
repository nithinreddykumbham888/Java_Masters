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
public class Laptop {
     private String laptopBrand;
    private String Processor;
    private double display;
    private int hardDrive;
    private String operatingSystem;
    private boolean touch;
    public Laptop(String laptopBrand1,String Processor1,double display1,int hardDrive1,String operatingSystem1,boolean touch1){
        laptopBrand = laptopBrand1;
        Processor = Processor1;
        display = display1;
        hardDrive = hardDrive1;
        operatingSystem = operatingSystem1;
        touch = touch1;
    }
    public Laptop(){}
    
    //getter's
    public String getlaptopBrand(){
        return laptopBrand;
    }
    
    public String getProcessor(){
        return Processor;
    }
    
    public double getdisplay(){
        return display;
    }
    
    public int gethardDrive(){
        return hardDrive;
    }
    
    public String getoperatingSystem(){
        return operatingSystem;
    }
    
    public boolean gettouch(){
        return touch;
    }
    
    // setter's
    public void setlaptopBrand(String laptopBrand1){
        laptopBrand = laptopBrand1;
    }
    
    public void setProcessor(String Processor1){
        Processor = Processor1;
    }
    
    public void setdisplay(double display1){
        display = display1;
    }
    
    public void sethardDrive(int hardDrive1){
        hardDrive = hardDrive1;
    }
    
    public void setoperatingSystem(String operatingSystem1){
        operatingSystem = operatingSystem1;
    }
    
    public void settouch(boolean touch1){
        touch = touch1;
    }
    
     @Override
    public String toString(){
        return "Laptop Brand: "+laptopBrand +"\n"+"Laptop Processor: "+Processor +"\n"+"Laptop Operating System: "+operatingSystem +"\n"+"Laptop Hard Drive: "+ hardDrive+"\n"+"Laptop Display: "+display +"\n"+"Laptop is Touch: "+touch; 
    }
}

    

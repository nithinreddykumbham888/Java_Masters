package edu.nwmissouri.zoo04lab;

enum DaysofWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY
}
/**
 * Squirrel class (derived from subclass of superclass Animal)    
 * @author Nithin Reddy Kumbham
 */

public class Squirrel extends Animal{
    /**
     * Squirrel constructor
     * @param String name1 
     */
    public Squirrel(String name1){
        super(name1);
    }
    
    /**
     * Method which defines type of animal with name
     * @param name 
     */
    public void typeofAnimal(String name){
        System.out.println("Hey I am herbivores and my name is "+name+", I eat only plants ");
    }
    
    @Override
    public void age(){
        System.out.println("My age is 6 years");
    }
    
    @Override
    public void height(){
        System.out.println("My height is 14.3 cm");
    }
    
    @Override
    public void weight(){
        System.out.println("My weight is 16 lbs");
    }
    
    /**
     * A method which returns height and weight of an animal combined in double
     * @param height of animal
     * @param weight of animal
     * @return height and weight of animal
     */
    
    public double heightweight(double height, double weight){
        return height + weight;
    }
    
    @Override
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    @Override
    public void speak(){
        System.out.println("I make a keech keech Sound");
    }
    
    @Override
    public void move(){
        System.out.println("I move with four legs");
    }
    
    @Override
    public void sleep(){
        System.out.println("I njoy my sleep, I sleep for 10 hours");
    }
    
    @Override
    public void gender(){
        System.out.println("I am female");
    }
    
    /**
     * Method void which multiplies a & b
     */
    public void functionMultiply(){
        int a = 10;
        int b = 15;
        System.out.println("Result of a*b is : "+a*b);
    }
    
    public static void main(String args[]){
        Squirrel pinto = new Squirrel("pinto");
        double height = 5.4;
        double weight = 15.9;
        double result = pinto.heightweight(height,weight);
        pinto.typeofAnimal("pinto");
        pinto.age();
        pinto.move();
        pinto.speak();
        pinto.isDisabled();
        pinto.functionMultiply();
        System.out.println("Height and weight of me combined is : "+result);
        
        //enum
        DaysofWeek monday = DaysofWeek.MONDAY;
        DaysofWeek sunday = DaysofWeek.SUNDAY;
        if(DaysofWeek.MONDAY == monday){
            System.out.println("Today is Monday, Gotta rush to work");
        }
        if(DaysofWeek.SUNDAY == sunday){
            System.out.println("Today is Sunday, The weekend is gonna complete");
        }
    }

    @Override
    public void typeofAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

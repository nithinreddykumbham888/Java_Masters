package edu.nwmissouri.zoo04lab;
/**
 *
 * @author Nithin Reddy Kumbham
 */
public class Squireel extends Animal{
    /**
     * Aardvark constructor
     * @param name1 
     */
    public Squireel(String name1){
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
    
    @Override
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    @Override
    public void sound(){
        System.out.println("I make a keech keech Sound");
    }
    
    @Override
    public void sleep(){
        System.out.println("I njoy my sleep, I sleep for 10 hours");
    }
    
    @Override
    public void gender(){
        System.out.println("I am female");
    }
}

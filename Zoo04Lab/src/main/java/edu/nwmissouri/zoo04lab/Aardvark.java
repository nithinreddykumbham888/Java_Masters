
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class Aardvark extends Animal implements Runnable{
    
    /**
     * Aardvark constructor
     * @param name2 
     */
    public Aardvark(String name2){
        super(name2);
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
        System.out.println("My age is 9 years");
    }
    
    @Override
    public void height(){
        System.out.println("My height is 15.6 cm");
    }
    
    @Override
    public void weight(){
        System.out.println("My weight is 25.9 lbs");
    }
    
    @Override
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    @Override
    public void speak(){
        System.out.println("I make a Grr Grr Sound");
    }
    
    @Override
    public void move(){
        System.out.println("I move with four legs");
    }
    
    @Override
    public void sleep(){
        System.out.println("I am busy with my work, So I sleep only 6 hours");
    }
    
    @Override
    public void gender(){
        System.out.println("I am male");
    }
    
    @Override
    public void run(){
        this.age();
        this.age();
        this.height();
        this.weight();
        this.isDisabled();
        this.speak();
        this.move();
        this.move();
        this.sleep();
        this.gender();
    }

    @Override
    public void typeofAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public abstract class Animal {
    
    private String  name= "This is an animal";
    
    /**
     * Animal constructor 
     * @param name1 
     */
    public Animal(String name1){
        name = name1;
    }
    
    /**
     * Method which Defines the type of animal
     */
    public abstract void typeofAnimal();
    
     /**
     * Method which Defines age of animal
     */
    public abstract void age();
    
    /**
     * Method which Defines height of animal
     */
    public abstract void height();
    
    /**
     * Method which Defines weight of animal
     */
    public abstract void weight();
    
    /**
     * Method which Defines whether the animal is disabled or not
     */
    public abstract void isDisabled();
    
    /**
     * Method which Defines the sound of animal
     */
    public abstract void speak();
    
     /**
     * Method which Defines how does the animal move
     */
    public abstract void move();
    
    /**
     * Method which Defines how many hours does the animal sleep
     */
    public abstract void sleep();
    
    /**
     * Method which Defines gender of animal
     */
    public abstract void gender();
    
}

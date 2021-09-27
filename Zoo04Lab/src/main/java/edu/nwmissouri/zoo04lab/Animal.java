
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
    public void typeofAnimal(){
        System.out.println("Defines the type of animal");
    }
    
     /**
     * Method which Defines age of animal
     */
    public void age(){
        System.out.println("Defines age of animal");
    }
    
    /**
     * Method which Defines height of animal
     */
    public void height(){
        System.out.println("Defines height of animal");
    }
    
    /**
     * Method which Defines weight of animal
     */
    public void weight(){
        System.out.println("Defines weight of animal");
    }
    
    /**
     * Method which Defines whether the animal is disabled or not
     */
    public void isDisabled(){
        System.out.println("Defines whether the animal is disabled or not");
    }
    
    /**
     * Method which Defines the sound of animal
     */
    public void sound(){
        System.out.println("Defines the sound of animal");
    }
    
    /**
     * Method which Defines how many hours does the animal sleep
     */
    public void sleep(){
        System.out.println("Defines how many hours does the animal sleep");
    }
    
    /**
     * Method which Defines gender of animal
     */
    public void gender(){
        System.out.println("Defines the gender of animal");
    }
    
}

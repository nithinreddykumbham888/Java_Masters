/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author s545694
 */
public class SquirrelTest {
    
    public SquirrelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of typeofAnimal method, of class Squirrel.
     */
    @Test
    public void testTypeofAnimal() {
        System.out.println("typeofAnimal");
        String name = "";
        Squirrel instance = null;
        instance.typeofAnimal(name);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of age method, of class Squirrel.
     */
    @Test
    public void testAge() {
        System.out.println("age");
        Squirrel instance = null;
        instance.age();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of height method, of class Squirrel.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        Squirrel instance = null;
        instance.height();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of weight method, of class Squirrel.
     */
    @Test
    public void testWeight() {
        System.out.println("weight");
        Squirrel instance = null;
        instance.weight();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of heightweight method, of class Squirrel.
     */
    @Test
    public void testHeightweight() {
        System.out.println("heightweight");
        double height = 0.0;
        double weight = 0.0;
        Squirrel instance = null;
        double expResult = 0.0;
        double result = instance.heightweight(height, weight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isDisabled method, of class Squirrel.
     */
    @Test
    public void testIsDisabled() {
        System.out.println("isDisabled");
        Squirrel instance = null;
        instance.isDisabled();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of speak method, of class Squirrel.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        Squirrel instance = null;
        instance.speak();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of move method, of class Squirrel.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Squirrel instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sleep method, of class Squirrel.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        Squirrel instance = null;
        instance.sleep();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of gender method, of class Squirrel.
     */
    @Test
    public void testGender() {
        System.out.println("gender");
        Squirrel instance = null;
        instance.gender();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Squirrel.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Squirrel.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

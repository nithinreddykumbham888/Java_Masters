/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author s545694
 */
public class DaysofWeekTest {
    
    public DaysofWeekTest() {
    }
    
    @BeforeEach
    public static void setUpClass() {
    }
    
    @AfterEach
    public static void tearDownClass() {
    }
    
    @BeforeAll
    public void setUp() {
    }
    
    @AfterAll
    public void tearDown() {
    }

    /**
     * Test of values method, of class DaysofWeek.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        DaysofWeek[] expResult = null;
        DaysofWeek[] result = DaysofWeek.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of valueOf method, of class DaysofWeek.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        DaysofWeek expResult = null;
        DaysofWeek result = DaysofWeek.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

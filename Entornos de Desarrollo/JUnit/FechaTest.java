/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pableras
 */
public class FechaTest {
    
    public FechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DevuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha1() {
        System.out.println("DevuelveFecha");
        int tipo = 1;
        Fecha instance = new Fecha();
        String expResult = "2024/05";
        String result = instance.DevuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha2() {
        System.out.println("DevuelveFecha");
        int tipo = 2;
        Fecha instance = new Fecha();
        String expResult = "05/2024";
        String result = instance.DevuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha3() {
        System.out.println("DevuelveFecha");
        int tipo = 3;
        Fecha instance = new Fecha();
        String expResult = "05/24";
        String result = instance.DevuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha4() {
        System.out.println("DevuelveFecha");
        int tipo = 4;
        Fecha instance = new Fecha();
        String expResult = "Error";
        String result = instance.DevuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

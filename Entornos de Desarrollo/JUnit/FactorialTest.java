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
public class FactorialTest {

    public FactorialTest() {
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
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculoFact0() {
        System.out.println("calculo");
        Factorial instance = new Factorial(0);
        long expResult = 1;
        long result = instance.calculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculoFact1() {
        System.out.println("calculo");
        Factorial instance = new Factorial(1);
        long expResult = 1;
        long result = instance.calculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculoFactPos() {
        System.out.println("calculo");
        Factorial instance = new Factorial(5);
        long expResult = 120;
        long result = instance.calculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculoFactNega() {
        System.out.println("calculo");
        Factorial instance = new Factorial(-5);
        long expResult = 0L;
        try {
            long result = instance.calculo();
            //assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("Se esperaba una Excepcion.");
        } catch (IllegalArgumentException e) {

        }
    }
}

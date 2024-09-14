/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Pruebas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Pableras
 */
@RunWith(Parameterized.class)
public class CalculadoraParamTest {

    private int num1;
    private int num2;
    private int resultadoEsperado;

    public CalculadoraParamTest(int num1, int num2, int resultadoEsperado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameters
    public static Collection<Object[]> numerosPruebas() {
        return Arrays.asList(new Object[][]{
            {0, 0, 0},
            {2, 3, 5},
            {-2, 3, 1},
            {5, -3, 2},
            {4, 4, 8},
            {10, 2, 5},
            {6, 3, 2},
            {10, 0, 0} // Para la prueba de división por cero
        });
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
     * Test of suma method, of class CalculadoraParam.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        CalculadoraParam instance = new CalculadoraParam(num1, num2);
        //int expResult = 0;
        int result = instance.suma();
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalculadoraParam.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        CalculadoraParam instance = new CalculadoraParam(num1, num2);
        //int expResult = 0;
        int result = instance.resta();
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class CalculadoraParam.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        CalculadoraParam instance = new CalculadoraParam(num1, num2);
        //int expResult = 0;
        int result = instance.multiplica();
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculadoraParam.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");

        if (num2 == 0) {
            try {

                CalculadoraParam instance = new CalculadoraParam(num1, num2);
                //int expResult = 0;
                int result = instance.divide();
                //assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("Se esperaba Exception.");
            } catch (ArithmeticException e) {
            }
        } else {
            CalculadoraParam instance = new CalculadoraParam(num1, num2);
            int result = instance.divide();
            assertEquals(resultadoEsperado, result);
        }
    }
}

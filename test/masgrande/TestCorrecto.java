/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masgrande;

import static masgrande.MasGrande.max;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCorrecto {
    
    public TestCorrecto() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void cardinalidadTest(){
        System.out.println("Prueba Cardinalidad");
        System.out.println("Prueba Cardinalidad 1");
        assertEquals(0, max(new int[] {}));
        System.out.println("Prueba Cardinalidad 2");
        assertEquals(0, max(new int[] {0}));
        System.out.println("Prueba Cardinalidad 3");
        assertEquals(1, max(new int[] {1,0}));
    }
    
    @Test
    public void ordenTest(){
        System.out.println("Prueba Orden");
        System.out.println("Prueba Orden 1");
        assertEquals(5, max(new int[]{3, 4, 5}));
        System.out.println("Prueba Orden 2");
        assertEquals(5, max(new int[]{3, 5, 4}));
        System.out.println("Prueba Orden 3");
        assertEquals(5, max(new int[]{5, 4, 3}));
    }
    
    @Test
    public void rangoTest(){
        System.out.println("Prueba Rango");
        System.out.println("Prueba Rango 1");
        assertEquals(-1, max(new int[]{-5, -3, -1}));
        System.out.println("Prueba Rango 2");
        assertEquals(0, max(new int[]{-2, -1, 0}));
        System.out.println("Prueba Rango 3");
        assertEquals(1, max(new int[]{-1, 0, 1}));
    }
    
    @Test
    public void existenciaTest(){
        System.out.println("Prueba existencia");
        System.out.println("Prueba existencia 1");
        assertEquals(0, max(null));
        System.out.println("Prueba existencia 2");
        assertEquals(0, max(new int[]{}));
        System.out.println("Prueba Existencia 3");
        assertEquals(0, max(new int[]{0}));
    }
}

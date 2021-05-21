package org.gobcan.cursoformacion.testprueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    @Test
    public void pruebaDeSuma1Test()
    {
        assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10));
    }
    
    @Test
    public void pruebaDeSuma2Test()
    {
    	assertNotEquals("La suma ha dejado de ser correcta", 10000, App.suma(100, 100));
    	assertEquals("La suma ha dejado de ser correcta", 1100, App.suma(100, 1000));
    }
    
    @Test
    public void pruebaDeSuma3Test()
    {
    	assertEquals("La suma ha dejado de ser correcta", 4, App.suma(2, 2));
    	assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10));
    	assertNotEquals("La suma ha dejado de ser correcta", 10000, App.suma(100, 100));
    	assertEquals("La suma ha dejado de ser correcta", 1100, App.suma(100, 1000));    	
    }        
    
    @Test
    public void pruebaDeSuma4Test()
    {
        assertEquals("La suma ha dejado de ser correcta", -1, App.suma(0, 0));
    }    
}

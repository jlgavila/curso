package org.gobcan.cursoformacion.testprueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
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
        assertEquals("La suma ha dejado de ser correcta", 20, Operaciones.suma(10, 10));
    }
    
    @Test
    public void pruebaDeSuma2Test()
    {
    	assertNotEquals("La suma ha dejado de ser correcta", 10000, Operaciones.suma(100, 100));
    	assertEquals("La suma ha dejado de ser correcta", 1100, Operaciones.suma(100, 1000));
    }
    
    @Test
    public void pruebaDeSuma3Test()
    {
    	assertEquals("La suma ha dejado de ser correcta", 4, Operaciones.suma(2, 2));
    	assertEquals("La suma ha dejado de ser correcta", 20, Operaciones.suma(10, 10));
    	assertNotEquals("La suma ha dejado de ser correcta", 10000, Operaciones.suma(100, 100));
    	assertEquals("La suma ha dejado de ser correcta", 1100, Operaciones.suma(100, 1000));    	
    }        
    
    @Test
    @Ignore
    public void pruebaDeSuma4Test()
    {
        assertEquals("La suma ha dejado de ser correcta", -1, Operaciones.suma(0, 0));
    }    
}

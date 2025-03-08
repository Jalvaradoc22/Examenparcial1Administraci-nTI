package packtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import packtest.testTri;
import static org.junit.Assert.*;
import org.junit.Test;
import packtest.testTri;
/**
 *
 * @author josea
 */
public class unit {
    @Test
    public void testCalcularArea_ValoresPositivos() {
        double resultado = testTri.calcularArea(10, 5);
        assertEquals(25.0, resultado, 0.001); 
    }

    @Test
    public void testCalcularArea_ValoresDecimales() {
        double resultado = testTri.calcularArea(7.5, 4.2);
        assertEquals(15.75, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularArea_BaseNegativa() {
        testTri.calcularArea(-5, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularArea_AlturaNegativa() {
        testTri.calcularArea(5, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularArea_BaseYAlturaCero() {
        testTri.calcularArea(0, 0);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.calculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author edu
 */
public class CalculadoraTest {

    static Calculadora c;

    @BeforeAll
    public static void crear() {
        System.out.println("Antes de los test");
        c = new Calculadora();
    }

    @AfterEach
    public void restablecer() {
        c.restablecer();
        System.out.println("Después de cada test");
    }

    @Test
    public void sumaTest() {
        System.out.println("SumaTest");
        float res = c.suma(3, 4);
        assertEquals(7, res);
    }

    @Test
    public void restaTest() {
        System.out.println("RestaTest");
        float res = c.resta(4, 3);
        assertEquals(1, res);
    }

    @Test
    public void multiplicaTest() {
        System.out.println("MultiplicaTest");
        float res = c.multiplica(3, 4);
        assertEquals(12, res);
    }

    @Test
    public void divideixTest() {
        System.out.println("DivideixTest");
        float res = c.divideix(12, 3);
        assertEquals(4, res);
    }

    @Test
    public void majorQueTest() {
        System.out.println("MajorQueTest");
        boolean res = c.majorQue(5, 4);
        assertEquals(true, res);
    }

}

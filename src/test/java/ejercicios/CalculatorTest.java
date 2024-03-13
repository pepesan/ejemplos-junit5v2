package ejercicios;

import example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("checking add")
    public void testOnePlusOneEqualsTwo(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.add(1,1);
        // THEN
        assertEquals(2, resultado, "Debería de ser 2");
    }
    @Test
    @DisplayName("checking subsctract")
    public void testOneMinusOneEqualsZero(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.subtract(1,1);
        // THEN
        assertEquals(0, resultado, "Debería de ser 0");
    }

    @Test
    @DisplayName("checking multiply")
    public void testOneMultiplyOneEqualsOne(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.multiply(1,1);
        // THEN
        assertEquals(1, resultado, "Debería de ser 1");
    }
    @Test
    @DisplayName("checking divide")
    public void testOneDivideOneEqualsOne(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.divide(1,1);
        // THEN
        assertEquals(1, resultado, "Debería de ser 1");
    }
    @Test
    @DisplayName("checking default memory")
    public void testDefaultMemory(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.getMemory();
        // THEN
        assertEquals(0, resultado, "Debería de ser 0");
    }

    @Test
    @DisplayName("checking default memory")
    public void testIncMemory(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        c.inc(1);
        // THEN
        assertEquals(1,c.getMemory(), "Debería de ser 1");
    }
}

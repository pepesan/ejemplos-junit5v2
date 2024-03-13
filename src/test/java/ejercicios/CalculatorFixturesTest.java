package ejercicios;

import example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorFixturesTest extends CalculatorBaseTest{

    @Test
    @DisplayName("checking add")
    public void testOnePlusOneEqualsTwo(){
        // WHEN
        int resultado  = c.add(1,1);
        // THEN
        assertEquals(2, resultado, "Debería de ser 2");
    }
    @Test
    @DisplayName("checking subsctract")
    public void testOneMinusOneEqualsZero(){
        // WHEN
        int resultado  = c.subtract(1,1);
        // THEN
        assertEquals(0, resultado, "Debería de ser 0");
    }

    @Test
    @DisplayName("checking multiply")
    public void testOneMultiplyOneEqualsOne(){
        // WHEN
        int resultado  = c.multiply(1,1);
        // THEN
        assertEquals(1, resultado, "Debería de ser 1");
    }
    @Test
    @DisplayName("checking divide")
    public void testOneDivideOneEqualsOne(){
        // WHEN
        int resultado  = c.divide(1,1);
        // THEN
        assertEquals(1, resultado, "Debería de ser 1");
    }
    @Test
    @DisplayName("checking default memory")
    public void testDefaultMemory(){
        // WHEN
        int resultado  = c.getMemory();
        // THEN
        assertEquals(0, resultado, "Debería de ser 0");
    }

    @Test
    @DisplayName("checking inc memory")
    public void testIncMemory(){
        // WHEN
        c.inc(1);
        // THEN
        assertEquals(1,c.getMemory(), "Debería de ser 1");
    }
}

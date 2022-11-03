package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {
    @Test
    public void testOnePlusOneEqualsTwo(){
        Calculator c= new Calculator();
        int resultado  = c.add(1,1);
        assertEquals(2, resultado);
    }
}

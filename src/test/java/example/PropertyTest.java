package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyTest {
    @Test
    public void memoryInitToZero(){
        Calculator c= new Calculator();
        int resultado  = c.getMemory();
        assertEquals(0, resultado);
    }
    @Test
    public void incOneToOne(){
        Calculator c= new Calculator();
        c.inc(1);
        int resultado = c.getMemory();
        assertEquals(1, resultado);
    }
}

package ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente c;
    @BeforeEach
    public void setUpTest(){
        this.c = new Cliente();
    }
    @Test
    public void constructorCorrecto(){
        assertNotNull(c);
    }
    @Test
    public void testMyConstructor(){
        assertEquals("", c.getNombre());
        assertEquals("", c.getApellido());
        assertEquals("", c.getDni());
        assertEquals("", c.getEmail());
        assertNull(c.getFechaNacimiento());
    }
}

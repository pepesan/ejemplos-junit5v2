package ejercicios.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProcesoTest {
    Proceso proceso = new Proceso();
    @BeforeEach
    public  void setUp(){
        proceso = new Proceso();
    }
    @Test
    public void testConstructorSinParametros(){
        assertNotNull(proceso.getNombre());
        assertEquals("", proceso.getNombre());
    }
    @Test
    public void testConstructorConParametros(){
        Proceso p = new Proceso("nombre");
        assertNotNull(p.getNombre());
        assertEquals("nombre", p.getNombre());
    }
    @Test
    public void testSetter(){
        proceso.setNombre("nombre");
        assertEquals("nombre", proceso.getNombre());
    }
}

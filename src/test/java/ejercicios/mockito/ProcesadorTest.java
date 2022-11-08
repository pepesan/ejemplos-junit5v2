package ejercicios.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProcesadorTest {
    Procesador procesador = new Procesador();
    @BeforeEach
    public void setUp(){
        procesador = new Procesador();
    }
    @Test
    public void testConstructorSinParametros(){
        assertNotNull(procesador.getComando());
        assertEquals("", procesador.getComando());
        assertNotNull(procesador.getProceso());
        assertEquals("", procesador.getProceso().getNombre());
    }
    @Test
    public void testConstructorConParametros(){
        Proceso proceso = new Proceso();
        procesador = new Procesador("nombre", proceso);
        assertNotNull(procesador.getComando());
        assertEquals("nombre", procesador.getComando());
        assertNotNull(procesador.getProceso());
        assertEquals(proceso, procesador.getProceso());
    }
    @Test
    public void testSetterComando(){
        procesador.setComando("comando");
        assertEquals("comando", procesador.getComando());
    }
    @Test
    public void testSetterProceso(){
        Proceso proceso = new Proceso();
        procesador.setProceso(proceso);
        assertEquals(proceso, procesador.getProceso());
    }
}

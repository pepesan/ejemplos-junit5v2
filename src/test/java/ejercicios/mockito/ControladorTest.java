package ejercicios.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ControladorTest {
    private Controlador c;

    @Before
    public void setup() {
        c = new Controlador();
    }
    @Test
    public void checkContructor(){
        assertNotNull(c.getModelo());
        assertNotNull(c.getDatosProcesados());
        assertEquals(0,c.getDatosProcesados().size());
    }
    @Test
    public void checkDatosProcesados(){
        c.list();
        assertNotNull(c.getDatosProcesados());
    }
}

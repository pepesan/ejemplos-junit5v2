package ejercicios.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ControladorTest {
    private Controlador c;

    @BeforeEach
    public void setup() {
        c = new Controlador();
    }
    @Test
    public void testContructor(){
        assertNotNull(c.getModelo());
        assertNotNull(c.getDatosProcesados());
        assertEquals(0,c.getDatosProcesados().size());
    }
    @Test
    public void checkDatosProcesados(){
        c.list();
        assertNotNull(c.getDatosProcesados());
    }
    @Test
    public void compruebaProcessData(){
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("Uno");
        listadoEsperado.add("Dos");
        listadoEsperado.add("Tres");
        c.setDatosProcesados(listadoEsperado);
        c.processData();
        assertEquals("Uno1",c.getDatosProcesados().get(0));
        assertEquals("Dos1",c.getDatosProcesados().get(1));
        assertEquals("Tres1",c.getDatosProcesados().get(2));
        assertEquals(3,c.getDatosProcesados().size());
    }
}

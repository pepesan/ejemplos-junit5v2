package ejercicios.mockito;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

public class ControladorModeloIntegrationTest {
    private Controlador c;
    private Modelo modeloMockeado;
    @Before
    public void setup() {
        c = new Controlador();
        modeloMockeado = spy(c.getModelo());
        c.setModelo(modeloMockeado);
    }
    @Test
    public void checkModel(){
        c.list();
        verify(modeloMockeado).list();
    }
    @Test
    public void checkModelProcessing(){
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("Uno");
        listadoEsperado.add("Dos");
        listadoEsperado.add("Tres");
        when(modeloMockeado.list()).thenReturn(listadoEsperado);
        c.list();
        assertEquals("Uno1",c.getDatosProcesados().get(0));
        assertEquals("Dos1",c.getDatosProcesados().get(1));
        assertEquals("Tres1",c.getDatosProcesados().get(2));
        assertEquals(3,c.getDatosProcesados().size());
    }
}

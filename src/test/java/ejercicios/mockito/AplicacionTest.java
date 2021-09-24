package ejercicios.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AplicacionTest {
    private Aplicacion app;
    @Before
    public void setup(){
        app = new Aplicacion();
    }
    @Test
    public void checkConstructor(){
        assertNotNull(app.controlador);
    }
    @Test
    public void checkControlador(){
        Controlador controladorMockeado = spy(app.controlador);
        app.controlador=controladorMockeado;
        app.main();
        verify(controladorMockeado).list();
    }
}

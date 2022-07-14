package ejercicios.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AplicacionControladorIntegrationTest {
    private Aplicacion app;
    @Before
    public void setup(){
        app = new Aplicacion();
    }

    @Test
    public void checkControlador(){
        Controlador controladorMockeado = spy(app.getControlador());
        app.setControlador(controladorMockeado);
        app.main();
        verify(controladorMockeado).list();
    }
}

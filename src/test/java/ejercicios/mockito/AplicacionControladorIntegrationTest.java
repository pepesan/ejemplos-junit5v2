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
    public void testControlador(){
        // creo el objeto simulado
        Controlador controladorMockeado = spy(app.getControlador());
        // asigno el objeto al objeto de la aplicación
        app.setControlador(controladorMockeado);
        // llamo al método que debería llamar al list de controlador
        app.main();
        // verifico que se ha llamado al método list del controlador
        verify(controladorMockeado).list();
    }
}

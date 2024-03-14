package ejercicios.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ApplicationControladorIntegrationTest {
    private Controlador controladorMockeado;
    private Aplicacion aplicacion;
    @BeforeEach
    public void setup() {
        aplicacion = new Aplicacion();
        controladorMockeado = spy(new Controlador());
        aplicacion.setControlador(controladorMockeado);
    }
    /*
        Método que comprueba si el método list del modelo
        es llamado cuando se llama al método list del controlador
     */
    @Test
    public void testModel(){
        // When
        // llamo al método que debería llamar al método del modelo
        aplicacion.list();
        // Then
        // assert de que se ha llamado al método list del modelo mockeado
        verify(controladorMockeado).list();
    }
}

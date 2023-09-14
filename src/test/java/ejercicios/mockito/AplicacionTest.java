package ejercicios.mockito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AplicacionTest {
    private Aplicacion app;
    @BeforeEach
    public void setup(){
        app = new Aplicacion();
    }
    @Test
    public void testConstructor(){
        assertNotNull(app.getControlador());
    }
    @Test
    public void testSetControlador(){
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.getControlador().list();
    }
}

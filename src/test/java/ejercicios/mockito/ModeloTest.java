package ejercicios.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModeloTest {
    private Modelo modelo;
    @Before
    public void setup() {
        modelo = new Modelo();
    }
    @Test
    public void testConstructor(){
        assertNotNull(modelo.list());
        assertEquals(2,modelo.list().size());
        assertEquals("UnValor",modelo.list().get(0));
        assertEquals("OtroValor",modelo.list().get(1));
    }
}


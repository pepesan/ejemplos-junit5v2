package example.integracion;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjetoTest {

    @Test
    @Tag("unidad")
    public void testConstructor(){
        Objeto objeto = new Objeto();
        assertEquals("", objeto.getCadena());
    }
    @Test
    @Tag("unidad")
    public void testConstructorConParametro(){
        String inicial = "inicial";
        Objeto objeto = new Objeto(inicial);
        assertEquals(inicial, objeto.getCadena());
    }
    @Test
    @Tag("unidad")
    public void testSetter(){
        String inicial = "inicial";
        Objeto objeto = new Objeto();
        objeto.setCadena(inicial);
        assertEquals(inicial, objeto.getCadena());
    }
}

package example.integracion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CajaTest {
    @Test
    public void testConstructor(){
        Caja caja = new Caja();
        assertNull(caja.getObjeto());
        assertNull(caja.getDatosProcesados());
    }
    @Test
    public void testConstructorConParametro(){
        Objeto objeto = new Objeto();
        Caja caja = new Caja(objeto);
        assertEquals(objeto, caja.getObjeto());
        assertNull(caja.getDatosProcesados());
    }
    @Test
    public void testSetterObjeto(){
        Objeto objeto = new Objeto();
        Caja caja = new Caja();
        caja.setObjeto(objeto);
        assertEquals(objeto, caja.getObjeto());
    }
    @Test
    public void testSetterDatosProcesados(){
        String dato = "Dato";
        Caja caja = new Caja();
        caja.setDatosProcesados(dato);
        assertEquals(dato, caja.getDatosProcesados());
    }

}

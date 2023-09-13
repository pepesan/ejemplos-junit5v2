package example.integracion;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CajaObjetoIntegrationTest {

    @Test
    @Tag("integracion")
    public void testIntegracionCajaObjeto(){
        // declaro el dato que quiero devolver
        String datoADevolver = "Micadena";
        // creo el objeto simulado
        Objeto objetoSimulado = spy(new Objeto());

        // cambio el comportamiento del objeto simulado para que
        // haga lo que yo le digo y no lo de por defecto
        when(objetoSimulado.getCadena()).thenReturn(datoADevolver);

        // Opción 1: Inicializar con objjeto simulado
        // declaro el objeto de caja inicializando con la constructora con parámetros
        Caja c = new Caja(objetoSimulado);

        // Opción 2: utilizar un setter para pasar el objeto simulado
        // Declarar un objeto de la clase Caja
        c = new Caja();
        // cambio el objeto original por el simulado
        c.setObjeto(objetoSimulado);

        // llamamos al método que debería hacer la llamada al objeto simulado
        c.procesaDatos();
        // comprobar que se procesado la llamada al objeto simulado
        verify(objetoSimulado).getCadena();
        // y que los datos se han procesado correctamente
        assertEquals("Micadena1", c.getDatosProcesados());
    }
}

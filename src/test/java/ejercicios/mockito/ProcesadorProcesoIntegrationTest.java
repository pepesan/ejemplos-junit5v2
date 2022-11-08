package ejercicios.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

public class ProcesadorProcesoIntegrationTest {
    @Test
    public void testIntegracionLLamaProceso(){
        Proceso proceso = spy(new Proceso());
        Procesador procesador = new Procesador("", proceso);
        /*
        Procesador procesador = new Procesador();
        procesador.setProceso(proceso);
        */
        String nombre = "nombre_proceso";
        // pedirle al objeto mockeado que deveulva esos datos
        when(proceso.getNombre()).thenReturn(nombre);
        procesador.llamaProceso();
        verify(proceso).getNombre();
        assertEquals("nombre_proceso -i", procesador.getComando());
    }
}

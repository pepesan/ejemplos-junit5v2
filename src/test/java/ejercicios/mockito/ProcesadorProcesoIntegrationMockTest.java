package ejercicios.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ProcesadorProcesoIntegrationMockTest {
    @Test
    public void testIntegracionLLamaProceso(){
        // Inicializa un objeto espiado o mockeado
        Proceso procesoMockeado = mock(Proceso.class);
        // Mete ese objeto dentro del otro objeto
        // Encapsulamiento
        Procesador procesador = new Procesador("", procesoMockeado);
        /*
            Procesador procesador = new Procesador();
            procesador.setProceso(proceso);
        */
        String nombre = "nombre_proceso";
        // pedirle al objeto mockeado que devuelva esos datos
        when(procesoMockeado.getNombre()).thenReturn(nombre);
        procesador.llamaProceso();
        verify(procesoMockeado).getNombre();
        assertEquals("nombre_proceso -i", procesador.getComando());
    }
}

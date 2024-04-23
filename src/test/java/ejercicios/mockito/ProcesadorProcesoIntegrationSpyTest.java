package ejercicios.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ProcesadorProcesoIntegrationSpyTest {
    @Test
    public void testIntegracionLLamaProceso(){
        // Inicializa un objeto espiado o mockeado
        Proceso procesoEspiado = spy(new Proceso());
        // Mete ese objeto dentro del otro objeto
        // Encapsulamiento
        // en base el spy
        Procesador procesador = new Procesador("", procesoEspiado);
        /*
            Procesador procesador = new Procesador();
            procesador.setProceso(proceso);
        */
        String nombre = "nombre_proceso";
        // pedirle al objeto mockeado que devuelva esos datos
        when(procesoEspiado.getNombre()).thenReturn(nombre);
        procesador.llamaProceso();
        verify(procesoEspiado).getNombre();
        assertEquals("nombre_proceso -i", procesador.getComando());
    }
}

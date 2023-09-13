package example.primer_ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiEstaticaTest {
    @Test
    public void pruebaEstatica(){
        // When/Then
        assertEquals(
                5,
                MiEstatica.add(2,3),
                "Debería devolver 5");
    }
}

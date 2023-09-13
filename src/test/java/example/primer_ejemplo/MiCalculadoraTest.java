package example.primer_ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiCalculadoraTest {
    @Test
    public void pruebaMiCalculadora(){
        // Given
        MiCalculadora calc = new MiCalculadora();
        // When
        Integer ret = calc.add(2,1);
        // Then
        assertEquals(
                3, // valor esperado
                ret, // valor real
                "Debería de devolver 3"); // mensaje por si peta
    }
    @Test
    public void otraPrueba(){
        // Given
        MiCalculadora c = new MiCalculadora();
        //  When + Then
        assertEquals(
                5,
                c.add(2,3)
                , "Debería devolver 5");
    }
}

package example.tags;

import example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClaseConTagsTest {
    @Test
    @DisplayName("2+1 son 3: Smoke 2")
    @Tag("smoke")
    void pruebaSimpleAceptacion(){
        // GIVEN -> Inicialización
        Calculator calculator = new Calculator();
        // WHEN -> Acciones
        int resultado = calculator.add(1,2);
        // THEN -> Comprobaciones (assert)
        assertEquals(3, resultado, "1+2 debería ser 3");
    }
}

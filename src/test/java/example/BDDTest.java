package example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Pruebas tipo BDD hechas con Junit")
class BDDTest {
    @Test
    @DisplayName("Prueba normal")
    void prueba1(){
        // GIVEN -> Inicialización
        Calculator calculator = new Calculator();
        // WHEN -> Acciones
        int resultado = calculator.add(1,2);
        // THEN -> Comprobaciones (assert)
        assertEquals(3, resultado, "1+2 debería ser 3");
    }
}

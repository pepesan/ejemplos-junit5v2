package example;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTests {
    @RepeatedTest(10)
    void repeatedTest() {
        int resultado = 2;
        assertEquals(2, resultado);
    }
}

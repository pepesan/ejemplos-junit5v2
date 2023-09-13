package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTests {
    @BeforeEach
    public void setUp(){
        System.out.println("antes");
    }
    @RepeatedTest(10)
    void repeatedTest() {
        int resultado = 2;
        assertEquals(2, resultado);
    }
}

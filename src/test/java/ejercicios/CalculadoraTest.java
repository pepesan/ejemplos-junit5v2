package ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora c;
    @BeforeEach
    public void beforeEach(){
        this.c = new Calculadora();
    }
    @Test
    public void testInit(){
        assertNotNull(c);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    public void testSuma(Integer a, Integer b, Integer r){
        assertEquals(r,c.suma(a,b));
    }

    @Test
    public void testMulti(){
        assertEquals(2,c.multi(1,2));
    }

    @Test
    public void testDiv(){
        assertEquals(2,c.div(2,1));
    }
}

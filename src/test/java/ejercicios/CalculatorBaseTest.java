package ejercicios;

import example.Calculator;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorBaseTest {
    public Calculator c;
    @BeforeEach
    public void setupEach(){
        // GIVEN
        c= new Calculator();
    }
}

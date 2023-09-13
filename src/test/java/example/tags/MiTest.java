package example.tags;

import example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MiTest {
    @Fast
    @Smoke
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    void add(int first, int second, int expectedResult) {
        System.out.println("first: "+first);
        System.out.println("second: "+second);
        System.out.println("expectedResult: "+expectedResult);
        Calculator calculator = new Calculator();
        int resultado= calculator.add(first, second);
        assertEquals(expectedResult, resultado);
    }
}

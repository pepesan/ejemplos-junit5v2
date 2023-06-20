package example.fixtures;

import example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FixturesCalculadoraTests {

    Calculator calculator;

    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void init() {

        System.out.println("@BeforeEach: inicializo el objeto calculator");
        this.calculator = new Calculator();
    }

    @Test
    @DisplayName("2+1 son 3")
    public void pruebaSuma(){

        assertEquals(3,calculator.add(2,1), "2 + 1 son 3");
    }
    @Test
    @DisplayName("1+1 son 2")
    public void pruebaSuma2(){
        assertEquals(2,calculator.add(1,1), "1 + 1 son 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll");
    }

}
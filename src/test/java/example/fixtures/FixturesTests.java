package example.fixtures;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FixturesTests {

    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach");
    }

    @Test
    void succeedingTest() {
        System.out.println("Prueba1");
    }
    /*
    @Test
    void failingTest() {
        fail("a failing test");
    }

     */

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    /*
    @Test
    void abortedTest() {
        System.out.println("Prueba2");
        assumeTrue("abc".contains("a"));
        //fail("test should have been aborted");
    }

     */

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll");
    }

}
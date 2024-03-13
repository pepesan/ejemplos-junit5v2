package example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  SimpleTest {
    @Test
    @DisplayName("1 + 1 = 2")
    public void testOnePlusOneEqualsTwo(){
        // GIVEN
        Calculator c= new Calculator();
        // WHEN
        int resultado  = c.add(1,1);
        // THEN
        assertEquals(2, resultado, "Debería de ser 2");
    }
}

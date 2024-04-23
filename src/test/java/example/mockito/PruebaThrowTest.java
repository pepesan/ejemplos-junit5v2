package example.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class PruebaThrowTest {
    @Test
    void givenNonVoidReturnType_whenUsingWhenThen_thenReturnString() {
        MyDictionary dictMock = mock(MyDictionary.class);
        when(dictMock.getMeaning(anyString())).thenReturn("Hola");
        String ret= dictMock.getMeaning("Adios");
        assertEquals(ret,"Hola", "Debería devolver Hola");
    }
    @Test
    void givenNonVoidReturnType_whenUsingWhenThen_thenExceptionIsThrown() {
        MyDictionary dictMock = mock(MyDictionary.class);
        when(dictMock.getMeaning(anyString())).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () -> dictMock.getMeaning("word"));
    }
    @Test
    void givenVoidReturnType_whenUsingDoThrow_thenExceptionIsThrown() {
        MyDictionary dictMock = mock(MyDictionary.class);
        doThrow(IllegalStateException.class).when(dictMock)
                .add(anyString(), anyString());

        assertThrows(IllegalStateException.class, () -> dictMock.add("word", "meaning"));
    }
    @Test
    void givenNonVoidReturnType_whenUsingWhenThenAndExeceptionAsNewObject_thenExceptionIsThrown() {
        MyDictionary dictMock = mock(MyDictionary.class);
        when(dictMock.getMeaning(anyString())).thenThrow(new NullPointerException("Error occurred"));

        assertThrows(NullPointerException.class, () -> dictMock.getMeaning("word"));
    }
    @Test
    void givenNonVoidReturnType_whenUsingDoThrowAndExeceptionAsNewObject_thenExceptionIsThrown() {
        MyDictionary dictMock = mock(MyDictionary.class);
        doThrow(new IllegalStateException("Error occurred")).when(dictMock)
                .add(anyString(), anyString());

        assertThrows(IllegalStateException.class, () -> dictMock.add("word", "meaning"));
    }
}

package ejercicios;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio2Junit5Test {
    @Test
    public void testSum() {
        int result = MathUtil.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testConcatenate() {
        String result = StringUtils.concatenate("Hola, ", "Mundo!");
        assertEquals("Hola, Mundo!", result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            MathUtil.divide(5, 0);
        });
    }

    @Test
    public void testEmptyList() {
        List<String> myList = new ArrayList<>();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void testListSize() {
        List<String> myList = Arrays.asList("A", "B", "C");
        assertEquals(3, myList.size());
    }

    @Test
    public void testObjectEquality() {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);
        assertEquals(person1, person2);
    }

    @Test
    public void testObjectInequality() {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        assertNotEquals(person1, person2);
    }

    @Test
    public void testNullCheck() {
        String value = null;
        assertNull(value);
    }

    @Test
    public void testNotNullCheck() {
        String value = "Hello";
        assertNotNull(value);
    }
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS) // Establecer un límite de tiempo de 5 segundos
    public void testArraySortingPerformance() {
        int arraySize = 1000000; // Tamaño del array a ordenar
        int[] numbers = generateRandomArray(arraySize);

        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers); // Ordena el array
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println("Tiempo de ejecución para ordenar un array de " + arraySize + " elementos: " + executionTime + " ms");

        // No es necesario verificar el límite de tiempo aquí, ya que JUnit 5 lo manejará automáticamente.
    }

    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    @Test
    @Tag("slow")
    public void testSlowOperation() {
        // Supongamos que esta es una operación que toma un tiempo significativo,
        // como la simulación de un cálculo intensivo o la interacción con una base de datos.

        // Ejemplo de una operación que toma tiempo:
        long result = performSlowOperation();

        // Verificamos si el resultado es el esperado.
        assertEquals(42, result);
    }

    private long performSlowOperation() {
        // Supongamos que aquí realizamos una operación que toma tiempo.
        // En este ejemplo, simplemente esperaremos unos segundos para simular una operación lenta.
        try {
            Thread.sleep(5000); // Simula una espera de 5 segundos.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Devolvemos un valor de ejemplo.
        return 42;
    }

    @ParameterizedTest
    @CsvSource({"2, 4", "3, 9", "4, 16"}) // Esta prueba se ejecutará 3 veces.
    public void testRepeatedOperation(int input, int expected) {
        int result = MathUtil.square(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/datos-cuadrado.csv", numLinesToSkip = 1)
    public void testSquare(int input, int expected) {
        int result = MathUtil.square(input);
        assertEquals(expected, result);
    }
}

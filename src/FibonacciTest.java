import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci0() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibonacciRecursivo(0));
    }

    @Test
    public void testFibonacci5() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(5, fibonacci.fibonacciRecursivo(5));
    }

    @Test
    public void testFibonacci10() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(55, fibonacci.fibonacciRecursivo(10));
    }
}

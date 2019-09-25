import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void init(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void testFibonacci12(){
        assertEquals(144, fibonacci.fibonacci(12));
    }

    @Test
    public void testFibonacci0(){
        assertEquals(0, fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacci20(){
        assertEquals(6765, fibonacci.fibonacci(20));
    }
}

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;



public class FactorialCalculatorTestNG {
    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(Factorial.factorial(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(Factorial.factorial(10), 3_628_800);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        expectThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
    }
}


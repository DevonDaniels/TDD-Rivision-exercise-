// Devon Daniels - 217299822
// Revision Exercise
package za.ac.cput.calculator;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void Identity() {
        calculator calculator = new calculator();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
    @Test
    void Equality() {
        calculator calculator = new calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }


    @Test
    void testFail() {
        fail("Failed Test");
    }

    @Test
    void Timeout() {
       assertTimeout(ofMillis(11), () -> Thread.sleep(10));
    }



    @Ignore
    @Test
    public void testDisable() {
        calculator calculator = new calculator();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
}


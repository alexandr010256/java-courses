import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void whenRunCleanResultMethodThenResultZero(){
        double expected = 0;
        calc.cleanResult();
        double result = calc.result;
        assertThat(result, Is.is(expected));
    }
}
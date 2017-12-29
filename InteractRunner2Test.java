import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class InteractRunner2Test {
    InteractRunner2 interactRunner2 = new InteractRunner2();

    @Test
    public void whenRunStartMethodThenResultZero(){
        double expected = 5;
        double result = interactRunner2.addAlg();
        assertThat(result, Is.is(expected));
    }
}

import org.example.Temperature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.example.Temperature.*;

public class TemperatureTest {

    @Test
    public void test1() {
        Temperature temperature = celsius(0);
        assertEquals(fahrenheit(32), temperature);
    }

    @Test
    public void test2() {
        Temperature temperature = celsius(0);
        assertNotEquals(fahrenheit(1), temperature);
    }

    @Test
    public void test3() {
        Temperature temperature = celsius(0);
        assertEquals(kelvin(273.15), temperature);
    }
    @Test
    public void test4() {
        Temperature temperature = celsius(10);
        assertEquals(fahrenheit(50), temperature);
    }
    @Test
    public void test5() {
        Temperature temperature = celsius(10);
        assertEquals(fahrenheit(60), temperature);
    }
}
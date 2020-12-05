import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleTests {
    @Test
    void successfulTest() {
        assertEquals("Test passed", "Test passed");
    }

    @Test
    void failedTest() {
        assertEquals("Test passed", "Test failed");

    }

}

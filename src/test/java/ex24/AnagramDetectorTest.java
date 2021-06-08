package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void checkLength_true() {
        String one = "tone";
        String two = "note";

        AnagramDetector test = new AnagramDetector();

        assertTrue(test.checkLength(one,two));
    }

    @Test
    void checkLength_false() {
        String one = "tone";
        String two = "notee";

        AnagramDetector test = new AnagramDetector();

        assertFalse(test.checkLength(one,two));
    }
}
import by.epamtc.poliukov.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testIsAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("8", "2.5", "0.21"));
        assertFalse(Utils.isAllPositiveNumbers("24", "2", "-0.1"));
    }
}
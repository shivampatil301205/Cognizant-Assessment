

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        int total = 7 * 3;
        assertEquals(21, total);

        assertTrue(total >= 20);
        assertFalse(total < 10);

        assertNull(null);

        Object value = Integer.valueOf(total);
        assertNotNull(value);
        assertEquals(21, ((Integer) value).intValue());
    }
}


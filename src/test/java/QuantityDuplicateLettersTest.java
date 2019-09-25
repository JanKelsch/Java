import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityDuplicateLettersTest {

    QuantityDuplicateLetters quantityDuplicateLetters;

    @Before
    public void init() {
        quantityDuplicateLetters = new QuantityDuplicateLetters();
    }

    @Test
    public void testQuantityDuplicateLetters() {
        String str1 = "aaabbcc";
        String str2 = "a3b2c2";
        assertEquals(str2, QuantityDuplicateLetters.duplicateLetters(str1));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsAnagramTest {
    IsAnagram isAnagram;

    @Before
    public void init() {
        isAnagram = new IsAnagram();
    }

    @Test
    public void testIsAnagram() {
        assertTrue(isAnagram.isAnagram("qwerty", "wertyq"));
    }
}

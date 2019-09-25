import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    StringDemo stringDemo;

    @Before
    public void init() {
        stringDemo = new StringDemo();
    }

    @Test
    public void testReversEmptyString() {
        assertEquals(stringDemo.revers(""), "");
    }

    @Test
    public void testRevers() {
        assertEquals(stringDemo.revers("String"), "gnirtS");
    }

    @Test
    public void testInvertEmptyString() {
        Assert.assertEquals(stringDemo.invert(""), "");
    }

    @Test
    public void testInvert() {
        assertEquals(stringDemo.invert("String"), "sTRING");
    }

    @Test
    public void testSimpleWord() {
        Assert.assertEquals(stringDemo.invert("String"), "sTRING");
    }
}

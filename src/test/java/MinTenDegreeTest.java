import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinTenDegreeTest {

    MinTenDegree minTenDegree;

    @Before
    public void init() {
        minTenDegree = new MinTenDegree();
    }

    @Test
    public void testGetDegree_input1_output0() {
        assertEquals(0, minTenDegree.getTenDegree(1));
    }

    @Test
    public void testGetDegree_input9_output0() {
        assertEquals(0, minTenDegree.getTenDegree(9));
    }

    @Test
    public void testGetDegree_inputLastNumber_outputLastNumber() {
        assertEquals(1_000_000_000, minTenDegree.getTenDegree(1_000_000_000));
    }

    @Test
    public void testGetDegree_input53799_output10000() {
        assertEquals(10_000, minTenDegree.getTenDegree(53799));
    }

    @Test
    public void testGetDegree_input100000_output100000() {
        assertEquals(100_000, minTenDegree.getTenDegree(100_000));
    }
}

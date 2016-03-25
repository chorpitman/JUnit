package MyTest.tests;

import MyTest.Calc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalcTest {
    private Calc calc = null;

    @Before
    public void testSetup() throws Exception {
        calc = new Calc();
    }

    @Test
    public void testAdd() throws Exception {
        int result = calc.add(1, 2);
        assertTrue(result == 3);
        assertFalse(result == 4);
    }

    @Test(expected = Exception.class)
    public void testDiv() throws Exception {
        calc.div(0, 0);
//        double result = calc.div(1, 2);
//        assertEquals(0.5, result);
//        assertTrue(result == 0.5);
//        assertFalse();
//        assertNull();
//        assertNotNull();
    }

    @Test(expected = Exception.class)
    public void testDivException() throws Exception {
        calc.div(2, 0);
    }


}
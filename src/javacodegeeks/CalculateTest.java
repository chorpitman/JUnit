package javacodegeeks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleg_Chorpita on 3/25/2016.
 */
public class CalculateTest {
    Calculate calculation = new Calculate();
    int sum = calculation.sum(2,5);
    int testSum = 7;

    @Test
    public void sum() {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);
    }
}
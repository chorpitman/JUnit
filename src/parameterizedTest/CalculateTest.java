package parameterizedTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculateTest {
    private int expected;
    private int first;
    private int second;

    //constructor with parametrized
    public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Integer[][]{{3, 1, 2}, {5, 2, 3}, {7, 3, 4}, {9, 4, 5}, {0, 0, 0}});
    }

    @Test
    public void sum() {
        Calculate add = new Calculate();
        System.out.println("Addition with parameters : " + first + " and " + second);
        assertEquals(expected, add.sum(first, second));
    }
}
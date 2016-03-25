package javacodegeeks;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void test() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;

        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        System.out.println("[assertEquals] " + obj1 + " = " + obj2);
        assertEquals("assertEquals: ", obj1, obj2);

        System.out.println("[assertSame] " + obj3 + " the same = " + obj4);
        assertSame(" assertSame ", obj3, obj4);

        System.out.println("[assertNotSame] " + obj2 + " not the same = " + obj4);
        assertNotSame("assertNotSame ", obj2, obj4);

        System.out.println("[assertNotNull] " + obj1);
        assertNotNull("assertNotNull ", obj1);

        System.out.println("[assertNull] " + obj5);
        assertNull("assertNull ", obj5);

        System.out.println("[assertTrue] " + var1 + " != " + var2);
        assertTrue("assertTrue ", var1 != var2);

        System.out.println("[assertArrayEquals] " + arithmetic1  + " = " +arithmetic2);
        assertArrayEquals("assertArrayEquals", arithmetic1, arithmetic2);
    }
}
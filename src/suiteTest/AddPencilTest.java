package suiteTest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AddPencilTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = {"Books", "Notebooks", "Pens", "Pencils"};

    @Test
    public void testAddPencils() {

        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag, school.addPencils());

    }

}
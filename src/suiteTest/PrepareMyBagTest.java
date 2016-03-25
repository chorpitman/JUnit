package suiteTest;

/**
 * Created by Oleg_Chorpita on 3/25/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class PrepareMyBagTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = { "Books", "Notebooks", "Pens" };

    @Test
    public void testPrepareMyBag() {

        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag, school.prepareMyBag());

    }

}
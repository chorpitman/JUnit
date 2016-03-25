package categoriesTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class C {
    @Test
    public void myF() {

    }
}

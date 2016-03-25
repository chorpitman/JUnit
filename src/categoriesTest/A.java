package categoriesTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.testng.Assert.fail;

@Category(SlowTest.class)
public class A {
    public void a() {
        fail();
    }

    @Test
    public void b() {
    }
}

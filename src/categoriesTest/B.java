package categoriesTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTest.class, FastTest.class})
public class B {
    @Test
    public void c() {
    }
}
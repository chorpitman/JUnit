package categoriesTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTest.class)
@Categories.ExcludeCategory(FastTest.class)
@Suite.SuiteClasses({A.class, B.class, C.class})
// Note that Categories is a kind of Suite
public class SlowTestSuite {
    // Will run A.b and B.c, but not A.a
}
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodCategories.class)
@Categories.ExcludeCategory(BadCategories.class)
@Suite.SuiteClasses({HelloJUnitTest.class, TrackingServiceTests.class})
public class GoodSuite {
}

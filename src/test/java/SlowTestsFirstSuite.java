import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses({ A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestsFirstSuite {
//    b() method of class A has been run...
//    c() method of class B has been run...
}
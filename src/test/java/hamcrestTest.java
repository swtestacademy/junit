import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.core.IsSame;
import org.junit.jupiter.api.Test;

public class hamcrestTest {

    //is method checks two values are equal or not.
    //If they are equal it returns true!
    //Below test will pass!
    @Test
    public void isMatcherTest() {
        assertThat("Onur", is("Onur"));
        assertThat(34, is(34));
    }

    //------------------------------------------------------------

    //IsNot method checks two values are equal or not.
    //If they are not equal it returns true!
    //Below test will pass!
    @Test
    public void isnotMatcherTest() {
        assertThat("Onur", is(not("Mike")));
    }

    //------------------------------------------------------------

    //AllOf method creates a matcher that matches
    //if the examined object matches ALL of the specified matchers.
    //Below test will pass!
    @Test
    public void allOfMatcherTest() {
        assertThat("myValue", allOf(startsWith("my"), containsString("Val")));
    }

    //------------------------------------------------------------

    //AnyOf method creates a matcher that matches
    //if the examined object matches ANY of the specified matchers.
    //Below test will pass!
    @Test
    public void anyOfMatcherTest() {
        assertThat("myValue", anyOf(startsWith("your"), containsString("Val")));
    }

    //------------------------------------------------------------

    //describedAs method adds a description to a Matcher
    //Below test will pass!
    @Test
    public void describedAsMatcherTest() {
        assertThat("Sunday", describedAs("Sunday is not Saturday.", is(not("Saturday"))));
    }

    //------------------------------------------------------------

    //IsAnything method is a matcher that always returns true.
    //Below test will pass!
    @Test
    public void isAnythingMatcherTest() {
        assertThat("Onur", is(anything("Bla Bla Bla")));
    }

    //------------------------------------------------------------

    //IsEqual method checks given objects equality.
    //Below test will pass!
    @Test
    public void isEqualMatcherTest() {
        assertThat("str", equalTo("str"));
        assertThat("str", is(equalTo("str")));
    }

    //------------------------------------------------------------

    //IsInstanceOf method creates a matcher that matches when the examined object is an instance of the specified type,
    //as determined by calling the Class.isInstance(Object) method on that type, passing the the examined object.
    //Below test will pass!
    InstanceTest myInstanceTest = new InstanceTest();

    @Test
    public void isInstanceOfMatcherTest() {
        assertThat(myInstanceTest, instanceOf(InstanceTest.class));
    }

    //------------------------------------------------------------

    //IsNot method creates a matcher that wraps an existing matcher, but inverts the logic by which it will match.
    //Below test will pass!
    @Test
    public void isNotMatcherTest() {
        assertThat("onur", is(not(equalTo("mike"))));
    }

    //------------------------------------------------------------

    //IsNull creates a matcher that matches if examined object is null.
    //Below test will pass!
    String myStr  = null;
    String myStr2 = "Onur";

    @Test
    public void isNullMatcherTest() {
        assertThat(myStr, is(nullValue()));
        assertThat(myStr2, is(notNullValue()));
    }

    //IsSame method creates a matcher that matches only when the
    //examined object is the same instance as the specified target object.
    //Below test will pass!
    @Test
    public void isSameMatcherTest() {
        String str1 = "Onur";
        String str2 = "Onur";

        assertThat(str1, IsSame.sameInstance(str2));
    }
}

class InstanceTest {
    String str = "Hello World!\n";

    public void print_1(String str) {
        System.out.println(str);
    }
}

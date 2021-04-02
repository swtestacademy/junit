import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionRuleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void throwsNullPointerExceptionWithMessage() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Null Pointer Problem!");
        throw new NullPointerException("Null Pointer Problem!");
    }

    //The new way of assertion Exceptions after 4.13 version of JUnit 4.
    //ExpectedException.none() is deprecated instead of this you can use Assert.assertThrows
    @Test
    public void throwsNullPointerExceptionNew() {
        Assert.assertThrows(NumberFormatException.class, () -> Integer.parseInt("Hello"));
        Assert.assertThrows(IllegalArgumentException.class, () -> Integer.parseInt("Hello"));
    }
}

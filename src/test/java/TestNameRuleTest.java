import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameRuleTest {
    @Rule
    public TestName name = new TestName();

    @Test
    public void testOne() {
        assertEquals("testOne", name.getMethodName());
    }

    @Test
    public void testTwo() {
        assertEquals("testTwo", name.getMethodName());
    }
}

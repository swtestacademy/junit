import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierRuleTest {
    private List<String> errorLog = new ArrayList<>();

    @Rule
    public Verifier verifier = new Verifier() {
        //After each method perform this check.
        @Override public void verify() {
            assertTrue("Error Log is not Empty!", errorLog.isEmpty());
        }
    };

    @Test
    public void testWritesErrorLog() {
        //...
        errorLog.add("There is an error!");
    }
}

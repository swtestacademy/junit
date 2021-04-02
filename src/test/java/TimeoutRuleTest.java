import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRuleTest {
    @Rule
    public Timeout timeout = new Timeout(2, TimeUnit.SECONDS);

    @Test
    public void testA() throws Exception {
        Thread.sleep(1000);
    }

    @Test
    public void testB() throws Exception {
        Thread.sleep(3000);
    }
}

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorRuleTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        collector.addError(new Throwable("First Error!"));
        collector.addError(new Throwable("Second Error!"));

        collector.checkThat(5, is(8)); //First Error
        collector.checkThat(5, is(not(8))); //Passed
        collector.checkThat(5, is(equalTo(9))); //Second Error
    }
}


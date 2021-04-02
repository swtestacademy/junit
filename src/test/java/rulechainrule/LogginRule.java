package rulechainrule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

class LoggingRule implements TestRule {
    private String name;

    public LoggingRule(String name) {
        this.name = name;
    }

    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    System.out.println("Starting: " + name);
                    base.evaluate();
                }
                finally {
                    System.out.println("finished: " + name);
                }
            }
        };
    }
}

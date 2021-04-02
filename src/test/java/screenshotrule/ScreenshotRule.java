package screenshotrule;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotRule implements TestRule {

    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                } catch (Throwable t) {
                    takeScreenshot();
                    throw t; // Report failure to JUnit
                }
            }
            private void takeScreenshot() throws IOException {
                File imageFile = ((TakesScreenshot) ScreenshotRuleTest.driver).getScreenshotAs(OutputType.FILE);
                String failureImageFileName = "SWTestAcademy_Failed_Test.png";
                File failureImageFile = new File(failureImageFileName);
                FileUtils.moveFile(imageFile, failureImageFile);
            }
        };
    }
}

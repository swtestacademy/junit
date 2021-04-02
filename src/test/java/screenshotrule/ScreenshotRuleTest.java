package screenshotrule;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotRuleTest {

    static WebDriver driver = new ChromeDriver();

    @Rule
    public ScreenshotRule screenshotRule = new ScreenshotRule();

    @Test
    public void testScreenShot() {
        driver.get("https://www.swtestacademy.com");
        driver.findElement(By.id("There_Is_No_This_Kind_Of_Element."));
    }
}

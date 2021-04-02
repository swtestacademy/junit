import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit4Annotations {

    static String websiteUrl = null;
    String user = null;

    //It will run only once
    @BeforeClass
    public static void SetInitialValues() {
        websiteUrl = "www.swtestacedemy.com";
        System.out.println("[@BeforeClass] Setting Initial Values...\nWebsite URL is: " + websiteUrl + "\n");
    }

    //It runs before every test. Default user is always Onur
    @Before
    public void setUserInfo() {
        user = "Onur";
        System.out.println("[@Before] Before test set user values.\nDefault user is: " + user + "\n");
    }

    //First test outputs "Ezgi"
    @Test
    public void T01_firstTest() {
        user = "Ezgi";
        System.out.println("[@Test] This is first test and user is: " + user + "\n");
    }

    //Second test outputs "Mike"
    @Test
    public void T02_secondTest() {
        user = "Mike";
        System.out.println("[@Test] This is second test and user is: " + user + "\n");
    }

    //Third test outputs "Onur" because I did not set another name to user value
    @Test
    public void T03_thirdTest() {
        System.out.println("[@Test] This is third test and user is: " + user + "\n");
    }

    //It runs at the end of each test clasess and set user value to null
    @After
    public void afterTest() {
        user = null;
        System.out.println("[@After] This test is finished...\nUser is: " + user + "\n");
    }

    //It runs only once when all test finished
    @AfterClass
    public static void afterClass() {
        System.out.println("[@AfterClass] All tests are finished!\n");
    }
}
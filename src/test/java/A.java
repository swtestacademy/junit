import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {
    @Test
    public void a() {
        System.out.println("a() method of class A has been run...\n");
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
        System.out.println("b() method of class A has been run...\n");
    }
}
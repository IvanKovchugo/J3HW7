import Tests.AfterSuite;
import Tests.BeforeSuite;
import org.testng.annotations.Test;

public class Testing {
    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("Приоритет тестового метода = 5");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Приоритет тестового метода = 1");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("Приоритет тестового метода = 10");
    }

    @Test(priority = 7)
    private void testMethod4() {
        System.out.println("Приоритет тестового метода = 7 (private)");
    }

    @Test
    public void testMethod5() {
        System.out.println("Приоритет тестового метода = default");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuite method");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite method");
    }
}

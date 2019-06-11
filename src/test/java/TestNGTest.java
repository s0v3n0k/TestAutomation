import org.testng.annotations.*;

public class TestNGTest {

    @BeforeTest
    public void setUp() { System.out.println("Before test execution"); }

    @BeforeMethod
    public void prepareEnvironment() { System.out.println("Before test method"); }

    @Test
    public void test1() { System.out.println("Test method #1"); }

    @AfterMethod
    public void clearEnvironment() { System.out.println("After test method"); }

    @AfterTest
    public void tearDown() { System.out.println("After test execution"); }
}

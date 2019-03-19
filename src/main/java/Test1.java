import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/john/Downloads/Autotests/geckodriver");
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.navigate().to("https://google.com");

        System.out.println(firefoxDriver.getTitle());

        firefoxDriver.quit();
    }

}

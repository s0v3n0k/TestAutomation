import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class translate {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/john/Downloads/Autotests/geckodriver");
        WebDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.navigate().to("http://23.22.147.136/become-tutor");

        try {
            firefoxDriver.findElement(By.xpath("//*[contains(text(), 'מקור הכנסה חדש')]"));
            System.out.println("Success!");
        }
        catch (Exception e) {
            System.out.println("Element wasn't found");
        }
        firefoxDriver.quit();
    }
}

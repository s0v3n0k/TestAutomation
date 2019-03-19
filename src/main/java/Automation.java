import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/john/Downloads/Autotests/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeDriver;
        WebDriverWait wait = new WebDriverWait(chromeDriver, 5);

        chromeDriver.navigate().to("http://laser.lancertool.com");
        chromeDriver.manage().window().maximize();

        chromeDriver.findElement(By.xpath("//li[@id='scpt1']")).click();

        System.out.println(chromeDriver.getTitle());
        wait.until(ExpectedConditions.titleIs("Bing Image Feed"));

        jsExecutor.executeScript("window.scrollTo(0, document.body.clientHeight)", "");

//        chromeDriver.quit();
    }

}

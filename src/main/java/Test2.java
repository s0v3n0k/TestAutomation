import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/john/Downloads/Autotests/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeDriver;
        WebDriverWait wait = new WebDriverWait(chromeDriver, 5);

        chromeDriver.navigate().to("https://bing.com");
        chromeDriver.manage().window().maximize();

        chromeDriver.findElement(By.xpath("//li[@id='scpt1']")).click();

        System.out.println(chromeDriver.getTitle());
        wait.until(ExpectedConditions.titleIs("Bing Image Feed"));

        jsExecutor.executeScript("window.scrollTo(0, document.body.clientHeight)", "");

        jsExecutor.executeScript("window.scrollTo(0, document.body.clientHeight)", "");

        chromeDriver.findElement(By.xpath("//*[@class='b_searchbox']")).sendKeys("automatio");

        jsExecutor.executeScript("window.scrollTo({ top: 0, behaviour: 'smooth'})");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='sa_sg']")));
        chromeDriver.findElement(By.xpath("//li[@class='sa_sg']")).click();

//        chromeDriver.quit();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testFirst() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String drivePath = "C:/Users/svitl/Documents/AUTOMATION/CHROMEDRIVER/chromedriver_win32/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, drivePath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000); //замораживает действия на 3 секунды

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult, actualResult);





    //    WebElement findSign = driver.findElement(By.xpath("//h2[text()='Welcome to 99 Bottles of Beer']"));

        driver.close();
        driver.quit();
        driver.quit();

    }

}

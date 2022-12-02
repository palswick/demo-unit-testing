import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    @Test
    public void testOpenOnlinerWebsite() {
        // System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

        // GIVEN
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.onliner.by/";
        String xpath = "//div[@class='footer-style__copy']";

        //WHEN
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.xpath(xpath));
        Util.waiter();
        String actual = element.getText();

        //THEN
        System.out.println(actual);
        driver.quit();
        Assert.fail();
    }
}

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
        String expected = "© 2001—2022 Onlíner";

        //WHEN
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.xpath(xpath));
//        Util.waiter();
        String actual = element.getText();

        //THEN
        Assert.assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void testOpenBaraholkaPage() {
        //GIVEN
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.onliner.by/";
        String xpathBaraholkaLink1 = "//*[@id=\"navigation-sidebar\"]/div[2]/a";
        String xpathBaraholkaLink2 = "//*[@id=\"navigation-sidebar\"]/div[2]/div[2]/div[2]/ul[1]/li[7]/a";
        String expected = "Барахолка";
        String xpathBaraholkaTitle = "//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/h1";
        driver.get(baseUrl);

        //WHEN
        WebElement elementBaraholkaLink1 = driver.findElement(By.xpath(xpathBaraholkaLink1));
        elementBaraholkaLink1.click();
        WebElement elementBaraholkaLink2 = driver.findElement(By.xpath(xpathBaraholkaLink2));
        elementBaraholkaLink2.click();
        WebElement elementBaraholkaTitle = driver.findElement(By.xpath(xpathBaraholkaTitle));
        String actual = elementBaraholkaTitle.getText();


        //THEN
        Assert.assertEquals(expected, actual);
        driver.quit();
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {
    @Test
    public void testOpenBaraholkaPage() {
        //GIVEN
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://svyatoslav.biz/testlab/wt/index.php";
        String xpathInputName = "//input[@name='name']";
        String xpathInputHeight = "//input[@name='height']";
        String xpathInputWeight = "//input[@name='weight']";
        String xpathInputMale = "//input[@value='male']";
        String xpathButtonSubmit = "//button[@type='submit']";
        String xpathResultTest = "//tbody/tr[2]/tr[2]";
        String expected = "Идеальная масса тела";
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

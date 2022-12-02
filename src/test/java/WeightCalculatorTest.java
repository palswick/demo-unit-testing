import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {
    @Test
    public void testWeightCalculator() {
        //GIVEN
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://svyatoslav.biz/testlab/wt/index.php";
        String xpathInputName = "//input[@name='name']";
        String xpathInputHeight = "//input[@name='height']";
        String xpathInputWeight = "//input[@name='weight']";
        String xpathInputMale = "//input[@value='m']";
        String xpathButtonSubmit = "//input[@type='submit']";
        String xpathResultText = "//tbody/tr[2]/td[2]";
        String expected = "Идеальная масса тела";

        //WHEN
        driver.get(baseUrl);

        By byInputName = By.xpath(xpathInputName);
        WebElement elementInputName = driver.findElement(byInputName);

        By byInputHeight = By.xpath(xpathInputHeight);
        WebElement elementInputHeight = driver.findElement(byInputHeight);

        By byInputWeight = By.xpath(xpathInputWeight);
        WebElement elementInputWeight = driver.findElement(byInputWeight);

        By byInputMale = By.xpath(xpathInputMale);
        WebElement elementInputMale = driver.findElement(byInputMale);

        By byButtonSubmit = By.xpath(xpathButtonSubmit);
        WebElement elementButtonSubmit = driver.findElement(byButtonSubmit);

        elementInputName.sendKeys("Vasya");
        elementInputHeight.sendKeys("180");
        elementInputWeight.sendKeys("80");
        elementInputMale.click();
        elementButtonSubmit.click();


        //THEN
       // Assert.assertEquals(expected, actual);
        driver.quit();
    }
}

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
        WeightCalculatorPage page = new WeightCalculatorPage(driver);

        //WHEN
        driver.get(page.baseUrl);
        page.myMethod("Vasya", "180", "80");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.expected, actual);
        driver.quit();
    }
}

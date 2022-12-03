import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {
    WebDriver driver;
    WeightCalculatorPage page;
    @Before
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        page = new WeightCalculatorPage(driver);
        driver.get(page.baseUrl);
    }
    @After
    public void afterMethod(){
        driver.quit();
    }

    @Test
    public void testWithValidData() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "80");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.expected, actual);
    }

    @Test
    public void testWithValidData2() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "40");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.expected2, actual);
    }

    @Test
    public void testWithValidData3() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "90");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.expected3, actual);
    }
}

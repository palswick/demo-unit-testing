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
        driver.get(page.URL);
    }
    @After
    public void afterMethod(){
        driver.quit();
    }

    @Test
    public void testWithValidDataForIdealWeight() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "80");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.RESULT_TEXT_FOR_IDEAL_WEIGHT, actual);
    }

    @Test
    public void testWithValidDataForTooLightweight() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "40");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.RESULT_TEXT_FOR_TOO_LIGHTWEIGHT, actual);
    }

    @Test
    public void testWithValidDataForQuiteHeavyweight() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "90");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.RESULT_TEXT_FOR_QUITE_HEAVYWEIGHT, actual);
    }

    @Test
    public void testWithValidDataForDecentHeavyweight() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "100");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.RESULT_TEXT_FOR_DECENT_HEAVYWEIGHT, actual);
    }

    @Test
    public void testWithValidDataForTooHeavyweight() {
        //WHEN
        page.fillFormAndClickSubmit("Vasya", "180", "110");
        String actual = page.getResultText();

        //THEN
        Assert.assertEquals(page.RESULT_TEXT_FOR_TOO_HEAVYWEIGHT, actual);
    }
}

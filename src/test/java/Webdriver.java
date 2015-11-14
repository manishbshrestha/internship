import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bidhan on 06/11/2015.
 */

public class Webdriver {
    public Webdriver() {
    }

    @Test
    public void TestGoogle() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk");
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Google", pageTitle);
    }

    @Test
    public void TestSearchtodaypremiereleaguematch() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk");
        WebElement textFrom = driver.findElement(By.id("lst-ib"));
        textFrom.sendKeys(new CharSequence[]{"today premiere league match"});
        textFrom.sendKeys(new CharSequence[]{Keys.ENTER});
        System.out.printf("print the results Page title" + driver.getTitle(), new Object[0]);
        Assert.assertEquals("Search results - today premiere league match", driver.getTitle());
    }


}
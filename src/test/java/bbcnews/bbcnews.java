package bbcnews;

import com.sun.javafx.binding.StringFormatter;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bidhan on 07/11/2015.
 */
public class bbcnews {
    public void bbcnews(){

    }

    @Test
    public void watchbbcnews() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.bbc.co.uk");
        String pageTitle = driver.getTitle();
        Assert.assertEquals("BBC -Home",pageTitle);
    }

    }



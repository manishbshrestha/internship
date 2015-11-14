package Neighbourblog;

import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Bidhan on 14/11/2015.
 */
public class homepage {
    public void acceptencehome() {

    }

    @Test

        public void homepage() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://neighbourblog.com//");
        String pageTitle = driver.getTitle();
        Assert.assertEquals("NeighbourBlog-London Blog/LondonForum/Neighbourhood Blog]", pageTitle);
    }




}

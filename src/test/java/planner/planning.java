package planner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;

/**
 * Created by Bidhan on 06/11/2015.
 */
public class planning {
    public void planning(){

    }
    @Test
    public void planthejourney(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.expedia.co.uk/");
        String pageTitle =driver.getTitle();
        Assert.assertEquals("Travel Deals;Flights, Hotels and Holidays - Travel with Expedia",pageTitle);
    }
    @Test
    public void travellondontoparis(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.expedia.co.uk/");
        WebElement textFrom=driver.findElement(id("paoriginckage-"));
        WebElement textfrom=driver.findElement(id("package-destination"));




    }

}

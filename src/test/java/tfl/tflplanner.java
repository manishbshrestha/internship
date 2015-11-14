package tfl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Bidhan on 12/11/2015.
 */
public class tflplanner {
    public void tflplan(){

    }

    @Test
    public void fares (){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://tfl.gov.uk/fares-and-payments/fares/single-fare-finder");
        String pageTitle=driver.getTitle();
        Assert.assertEquals("Single fare finder - Transport for London",pageTitle);
        WebElement From =driver.findElement(By.id("From"));
        From.sendKeys("Richmond ");
        Select dropdown = new Select(driver.findElement(By.id("FromId")));
        dropdown.selectByValue("2");
        driver.findElement(By.id("FromId")).click();
        WebElement To = driver.findElement(By.id("To"));
        To.sendKeys("London Victoria Station");
        dropdown = new Select(driver.findElement(By.id("FromId")));
        dropdown.selectByVisibleText("London Victoria Rail Station");
        driver.findElement(By.id("To")).click();
        driver.findElement(By.id("submit")).click();

    }
}

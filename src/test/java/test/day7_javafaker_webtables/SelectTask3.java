package test.day7_javafaker_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SelectTask3 {

    WebDriver driver;
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }
    @BeforeMethod
    public void setUp(){
        //TC#1: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void task3_select_date_test(){

        //Select “December 1st, 1921” and verify it is selected.
        // Select year using: visible text
        // Select month using : value attribute
        // Select day using: index number

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1921");
        String YearActual = yearDropdown.getFirstSelectedOption().getText();
        String YearExpected = "1921";

        //   Select month using : value attribute
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11"); //--> will select December using attribute value
        String MonthActual = monthDropdown.getFirstSelectedOption().getText();
        String MonthExpected = "December";

        //   Select day using: index number
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByIndex(0);
        String DayActual = dayDropdown.getFirstSelectedOption().getText();
        String DayExpected = "1";

        Assert.assertEquals(YearActual,YearExpected);
        Assert.assertEquals(DayActual,DayExpected);
        Assert.assertTrue(DayActual.equals(DayExpected));


    }
}

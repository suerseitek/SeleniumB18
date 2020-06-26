package test.day6_testng_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class DropdownsIntro  {


        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

       driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/dropdown");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void test1_default_value_verification(){

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']")));
        String actualdefaultOfSImpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultOfSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualdefaultOfSImpleDropdown,expectedDefaultOfSimpleDropdown);

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdown = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdown = "Select a State";

        Assert.assertEquals(actualStateDropdown,expectedStateDropdown);

    }

    @Test
    public void test2_state_dropdown_verification() throws InterruptedException{

        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select Illinois
        // 4.Select Virginia
        // 5.Select California
        // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)


        Select StateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);
        StateDropDown.selectByValue("IL");

        Thread.sleep(1000);
        StateDropDown.selectByVisibleText("Virginia");

        Thread.sleep(1000);
        StateDropDown.selectByIndex(5);

        String actualStateDropDownText = StateDropDown.getFirstSelectedOption().getText();
                String expectedStateDropDownText = "California";
                Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);


    }
}

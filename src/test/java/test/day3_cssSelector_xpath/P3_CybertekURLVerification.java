package test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {

    /*
    TC #3: PracticeCybertek/ForgotPassword URL verification

    2.Go to http://practice.cybertekschool.com/forgot_password
    3.Enter any email into input box
    4.Click on Retrieve password
    5.Verify URL contains: Expected: “email_sent”
    6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
     */
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("anyemail@email.com");

        Thread.sleep(2000);
        driver.findElement(By.id("form_submit")).click();

        String actualURL = driver.getCurrentUrl();
        String expectedInURL = "email_sent";

        System.out.println("Current URL is: "+ actualURL);
        if(actualURL.contains(expectedInURL)){
            System.out.println("URL verification PASSED");
        }else {
            System.out.println("URL verification FAILED");
        }

        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        String expectedText = "Your e-mail's been sent!";

        System.out.println("Confirmation message text: "+ actualText);
        if(actualText.equals(expectedText)){
            System.out.println("Confirmation message text verification PASSED");
        }else{
            System.out.println("Confirmation message text verification FAILED");
        }

        driver.quit();


    }



}

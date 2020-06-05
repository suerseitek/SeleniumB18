package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_LinkTextLocator {

    public static void main(String[] args) throws Exception {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.ru");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Gmail")).click();

        String ActualGmailTitle = driver.getTitle();
        String expectedGmailTitle = "Gmail";

        if(ActualGmailTitle.contains(expectedGmailTitle)){
            System.out.println("Gmail title verification PASSED!");
        }else{
            System.out.println("Gmail title verification FAILED!");
        }

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";
        if(actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED");
        }else{
            System.out.println("Google title verification FAILED");
        }



        driver.quit();





    }
}

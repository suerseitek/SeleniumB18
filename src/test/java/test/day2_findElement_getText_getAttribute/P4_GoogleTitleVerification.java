package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class P4_GoogleTitleVerification {



    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        String actualTitle = driver.getTitle();
        String expectedinTitle= "apple";

        if(actualTitle.startsWith(expectedinTitle)){
            System.out.println("Google search title verification PASSED");
        }else{
            System.out.println("Google search title verification FAILED");
        }

        driver.close();





    }




}

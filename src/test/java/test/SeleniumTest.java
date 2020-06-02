package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.manage().window().maximize();

         Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

       Thread.sleep(2000);
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.getPageSource();

        Thread.sleep(2000);
        driver.close();


    }


}

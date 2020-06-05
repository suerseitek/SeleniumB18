package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_GoogleTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https:google.com");
        chrome.getTitle();

        String actualTitle = chrome.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED");
        }

        chrome.close();


        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https:practice.cybertekschool.com");

        String actualTitleFirefox = firefox.getTitle();
        String expectedres = "Practice";
        if(actualTitleFirefox.equals(expectedres)){
            System.out.println("Practice title verification PASSED!");
        }else{
            System.out.println("Practice title verification FAILED");
        }

firefox.close();

    }



}

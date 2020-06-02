package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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


    }



}

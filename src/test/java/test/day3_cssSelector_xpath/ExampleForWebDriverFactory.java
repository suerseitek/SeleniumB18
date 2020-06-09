package test.day3_cssSelector_xpath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class ExampleForWebDriverFactory {

    public static void main(String[] args) throws Exception{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.quit();


    }


}

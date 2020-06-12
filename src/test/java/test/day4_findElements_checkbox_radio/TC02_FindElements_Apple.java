package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC02_FindElements_Apple {

    public static void main(String[] args) throws Exception{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://apple.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class ='ac-gn-link ac-gn-link-iphone']")).click();
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks) {
            //System.out.println(eachLink.getText());
            String textOfEachLink = eachLink.getText();


            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                System.out.println(textOfEachLink);
                linksWithText++;
            }

        }
        //4. Print out how many link is missing text
        System.out.println("The number of links that does NOT have text: " + linksWithoutText);

        //5. Print out how many link has text
        System.out.println("The number of links that have text: " + linksWithText);

        //6. Print out how many total link
        System.out.println("Total links on this page: " + listOfLinks.size());


    }

    }


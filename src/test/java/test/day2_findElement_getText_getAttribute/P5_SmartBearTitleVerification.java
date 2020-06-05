package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBearTitleVerification {

/*
TC#5:	Basic	login	authentication
Open a	chrome	browser2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx3-Verify
	title	equals:Expected:
	Web	Orders	Login4-Enter
username:	Tester5-Enter
	password:	test6-Click	“Sign	In”	button7-Verify	titleequals:Expected:	Web	Orders
 */

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String actualWebOrdersTitle = driver.getTitle();
        String expectedWebOrdersTitle = "Web Orders";
        Thread.sleep(2000);
        if(actualWebOrdersTitle.contains(expectedWebOrdersTitle)){
            System.out.println("Login title verification passed");
        }else{
            System.out.println("Login title verification failed");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        if(actualWebOrdersTitle.contains(expectedWebOrdersTitle)){
            System.out.println("Landing Page title verification passed");
        }else{
            System.out.println("Landing Page title verification failed");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}


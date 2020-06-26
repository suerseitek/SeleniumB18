package test.day6_testng_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeClass
    public void before_class(){
        System.out.println("before class is running");
    }

    @AfterClass
    public void after_class(){
        System.out.println("after class is running");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("after method is running");
    }

    @Test
    public void test1( ){
        System.out.println("test1 is running");
        String actualTitle = "Homepage";
        String expectedTitle = "Homepage";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void test2(){
        System.out.println("test2 is running");
        Assert.assertEquals("string2", "string2", "String verification on test2 failed");
    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("test3 is running");
        String actualTitle = "Amazon prime";
        String expectedTitle = "prime";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
     //   Assert.assertFalse(actualTitle.contains(expectedTitle));

    }

}

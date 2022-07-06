package amazon_02;

import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonSearchBoxFunctionalityOnChrome extends TestBase_02 {

    static String expectedText;
    static String actualText;

    //        public static void searchBoxOnChrome() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        //   enter keyword in searchBox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        //  click on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // Verify searched product
//        expectedText = "\"iPhone 14\"";
//        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "Not Match");
//        Thread.sleep(4000);
//    }
    public static void searchBoxOnChrome() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");

        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        Thread.sleep(2000);


    }
}

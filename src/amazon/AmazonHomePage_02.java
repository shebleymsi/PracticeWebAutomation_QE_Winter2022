package amazon;

import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonHomePage_02 extends TestBase_02 {
    // Action method class
    static String actualText;
    static String expectedText;

    public static void searchBoxOnChrome() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        expectedText = "\"iPhone 14\"";
        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "Not Match");
        Thread.sleep(5000);
    }

    public static void signIn() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click on continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
        driver.findElement(By.name("password")).sendKeys("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify successful login
        String expectedText = "Hello, Shebley";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
        Thread.sleep(5000);

    }




}

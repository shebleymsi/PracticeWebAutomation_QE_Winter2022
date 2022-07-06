package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonSignInFunctionality extends TestBase_02  {

        public static void signIn() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Enter email or phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click on continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
        driver.findElement(By.name("password")).sendKeys("010407");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify successful login
        String expectedText = "Hello, Shebley";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
        Thread.sleep(4000);

    }
    public static void signInUsingInvalidCredential() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter WRONG password
        driver.findElement(By.name("password")).sendKeys("010407");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify successful login
        String expectedText = "There was a problem";
        String actualText = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn is successful and Error message not showing ");
        String expectedTitle = "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not match");
        Thread.sleep(4000);

    }
}

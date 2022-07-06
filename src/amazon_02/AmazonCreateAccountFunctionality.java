package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonCreateAccountFunctionality extends TestBase_02  {
        public static void createAccountFunctionalityCheckWithValidEmail() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        // Click the "Hello, Sign in Account & Lists" button.
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Click the "Create your Amazon account" button
        driver.findElement(By.className("a-button-text")).click();
        // Enter name Shebley
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Shebley");
        // Enter valid mobile number or email	shebleyxxx@gmail.com
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shebleymsi@gmail.com");
        // Enter password 	$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // Re-enter password
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("$$$$$$$$$$$$$$$$$$");
        // click continue button
        driver.findElement(By.id("continue")).click();
        // Enter (hidden) code
        driver.findElement(By.xpath(""));                  // NEXT SEE SHEBLEY
        //Click verify
        driver.findElement(By.xpath("")).click();          // NEXT SEE SHEBLEY
        // Verify to create an account
        // [ " Verify to create an account functionality check with valid email and sign in and user last name displayed the top right corner
        // (beside the flag key) in the home page." ]
        String expectedText = "Hello, Shebley";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
        Thread.sleep(4000);


    }
}

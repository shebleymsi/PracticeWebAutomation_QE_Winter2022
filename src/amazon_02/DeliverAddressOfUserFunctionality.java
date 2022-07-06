package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;

public class DeliverAddressOfUserFunctionality extends TestBase_02  {
    static String actualText;
    static String expectedText;

        public static void checkDefaultDeliverAddressOfUser() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        // Click on Deliver Location Icon
        driver.findElement(By.id("glow-ingress-line1")).click();
        // Click on zip code Button
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("11368");

        System.out.println("Actual Text " + actualText);
        String zipCode = driver.findElement(By.id("glow-ingress-line2")).getText();
        System.out.println("Zip Code is " + zipCode);
        // Click Apply Button
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();

        Thread.sleep(5000);

    }
}

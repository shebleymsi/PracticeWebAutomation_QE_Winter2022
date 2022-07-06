package amazon_02;

import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonBasicFunctionality extends TestBase_02 {
    // Action method class

    public static void amazonBasic() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        // Click on Amazon Basics button
        driver.findElement(By.className("nav-a")).click();
        Thread.sleep(4000);

    }
}

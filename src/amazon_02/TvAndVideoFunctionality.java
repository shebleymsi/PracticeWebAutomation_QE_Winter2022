package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;

public class TvAndVideoFunctionality extends TestBase_02 {
        public static void tvAndVideo() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        //  Click on TV & Video
        driver.findElement(By.className("nav-a")).click();
        Thread.sleep(4000);
    }
}

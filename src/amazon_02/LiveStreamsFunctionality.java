package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;

public class LiveStreamsFunctionality  extends TestBase_02 {
        public static void liveStreams() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        // Click on Livestreams button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(4000);
    }
}

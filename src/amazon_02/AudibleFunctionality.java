package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;
public class AudibleFunctionality extends TestBase_02  {
        public static void audible() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        //Click on Audiable button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(4000);

    }
}

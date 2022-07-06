package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;

public class TodaysDealsFunctionality extends TestBase_02  {
        public static void todaysDeals() throws InterruptedException {
        // setUp("chrome","https://www.amazon.com/");
        //Click on Today's Deals button
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        Thread.sleep(4000);

    }
}

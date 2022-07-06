package amazon_02;
import base.TestBase_02;
import org.openqa.selenium.By;

import static base.TestBase_02.driver;

public class NavigateToYahoo extends TestBase_02 {
    public static void navigateToYahoo() throws InterruptedException {
        // Navigate To Yahoo Browser and search
        driver.navigate().to("https://www.yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("Purnima Bangladeshi film actress picture");
        driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
        Thread.sleep(4000);

    }
}

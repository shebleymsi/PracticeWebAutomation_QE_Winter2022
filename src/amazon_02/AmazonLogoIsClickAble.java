package amazon_02;

import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static base.TestBase_02.driver;

public class AmazonLogoIsClickAble extends TestBase_02 {
        public static void amazonLogoIsClickAble() throws InterruptedException {
       //   setUp("chrome","https://www.amazon.com/");
       // click on amazon logo
       driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
       Thread.sleep(4000);

  }
}

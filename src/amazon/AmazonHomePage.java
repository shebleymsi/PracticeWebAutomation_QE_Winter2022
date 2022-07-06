package amazon;


import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AmazonHomePage extends TestBase {

    // Action method class

    static String actualText;
    static String expectedText;


    /**
     * This method should search the product in amazon searchBox
     *
     * @throws InterruptedException Author: Shebley
     */
    public static void searchBoxOnChrome() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");

        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        Thread.sleep(4000);


    }

    /**
     * This method should search the product in amazon searchBox
     *
     * @throws InterruptedException Author: Shebley
     */
    public static void searchBoxOnFireFox() throws InterruptedException {
        //    setUp("fireFox","https://www.amazon.com/");
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }


        // driver.findElement(By.tagName("id Value"));
        Thread.sleep(3000);
        // driver.close();


    }

    /**
     * This method will verify successful signIn using valid credential
     *
     * @throws InterruptedException Author: Shebley
     */

    public static void signIn() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");

        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();

        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click continue button
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
        Thread.sleep(3000);


    }

    /**
     * This method will verify unsuccessful signIn using Invalid credential and verify Error message
     *
     * @throws InterruptedException
     */

    public static void signInUsingInvalidCredential() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // System.out.println("Hello");
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // display();
        // Click continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
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

        Thread.sleep(2000);


    }

    /**
     * This method should navigateToYahoo
     *
     * @throws InterruptedException Author: Shebley
     */
    public static void navigateToYahoo() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().to("https://www.yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("Trump");
        driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();

//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"yschsp\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"yschsp\"]")).sendKeys("Bush");
//        driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();


        //       try {
//           int i=0;
//           while (i<3){
//               try {
//                   WebElement element= driver.findElement(By.xpath("//*[@id=\"yschsp123\"]"));
//                   System.out.println("element found for ");
//               } catch (Exception e){
//                   System.out.println("Element not found in looping "+i);
//                   System.out.println(e.getMessage());
//                //  e.printStackTrace();
//               }
//               Thread.sleep(1000);
//              i++;
//           }
//
//       }catch (Exception e){
//           System.out.println("Error yahoo");
//           System.out.println(e.getMessage());
//           e.printStackTrace();
//       }



        Thread.sleep(3000);

        //  Thread.sleep(5000);
    }


}

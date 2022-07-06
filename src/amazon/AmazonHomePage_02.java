package amazon;

import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePage_02 extends TestBase_02 {
         // Action method class
 //       static String actualText;
//        static String expectedText;
//
//    public static void navigateToYahoo() throws InterruptedException {
//        // Navigate To Yahoo Browser and search
//        driver.navigate().to("https://www.yahoo.com");
//        driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("Purnima Bangladeshi film actress picture");
//        driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
//        Thread.sleep(4000);
//
//    }
//
//
//    public static void searchBoxOnChrome() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        //   enter keyword in searchBox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        //  click on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // Verify searched product
//        expectedText = "\"iPhone 14\"";
//        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "Not Match");
//        Thread.sleep(4000);
//    }
//
//    public static void searchBoxOnFireFox() throws InterruptedException {
//        //    setUp("fireFox","https://www.amazon.com/");
//        //   enter keyword in searchBox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        //  click on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // Verify searched product
//        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        expectedText = "\"iPhone 14\"";
//        System.out.println("Expected Text : " + expectedText);
//
//        if (actualText.equals(expectedText)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//
//        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
//        if (actualProductName.equals(expectedProductName)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//
//        Thread.sleep(4000);
//
//
//    }
//
//    public static void signIn() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        // Click on Hello SignIn
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        // Enter email or phoneNumber
//        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
//        // Click on continue button
//        driver.findElement(By.cssSelector("#continue")).click();
//        // Enter password
//        driver.findElement(By.name("password")).sendKeys("010407");
//        // Click SignIn Button
//        driver.findElement(By.className("a-button-input")).click();
//        // Verify successful login
//        String expectedText = "Hello, Shebley";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
//        Thread.sleep(4000);
//
//    }
//
//    public static void createAccountFunctionalityCheckWithValidEmail() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click the "Hello, Sign in Account & Lists" button.
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        // Click the "Create your Amazon account" button
//        driver.findElement(By.className("a-button-text")).click();
//        // Enter name Shebley
//        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Shebley");
//        // Enter valid mobile number or email	shebleyxxx@gmail.com
//        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shebleymsi@gmail.com");
//        // Enter password 	$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        // Re-enter password
//        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("$$$$$$$$$$$$$$$$$$");
//        // click continue button
//        driver.findElement(By.id("continue")).click();
//        // Enter (hidden) code
//        driver.findElement(By.xpath(""));                  // NEXT SEE SHEBLEY
//        //Click verify
//        driver.findElement(By.xpath("")).click();          // NEXT SEE SHEBLEY
//        // Verify to create an account
//        // [ " Verify to create an account functionality check with valid email and sign in and user last name displayed the top right corner
//        // (beside the flag key) in the home page." ]
//        String expectedText = "Hello, Shebley";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
//        Thread.sleep(4000);
//
//
//    }
//
//    public static void signInUsingInvalidCredential() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        // Click on Hello SignIn
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        // Enter email/ phoneNumber
//        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
//        // Click continue button
//        driver.findElement(By.cssSelector("#continue")).click();
//        // Enter password
//        driver.findElement(By.name("password")).sendKeys("010407");
//        // Click SignIn Button
//        driver.findElement(By.className("a-button-input")).click();
//        // Verify successful login
//        String expectedText = "There was a problem";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "SignIn is successful and Error message not showing ");
//        String expectedTitle = "Amazon Sign-In";
//        String actualTitle = driver.getTitle();
//        System.out.println("Actual Title : " + actualTitle);
//        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not match");
//        Thread.sleep(4000);
//
//    }
//
//    public static void amazonLogoIsClickAble() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        // click on amazon logo
//        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
//        Thread.sleep(4000);
//
//    }
//
//
//    public static void liveStreams() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Livestreams button
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void healthAndHousehold() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Health & Household button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void audible() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        //Click on Audiable button
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
//        Thread.sleep(4000);
//
//    }
//
//
//    public static void beautyAndPersonalCare() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        //Click on Beauty&Care button
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void todaysDeals() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        //Click on Today's Deals button
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
//        Thread.sleep(4000);
//
//    }
//
//
//    public static void amazonBasic() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Amazon Basics button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void buyAgain() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Buy Again button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void shopperToolKit() throws InterruptedException {
//        // setup("chrome", "https://www.amazon.com/");
//        // Click on Shopper Tool Kit
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void pharmacy() throws InterruptedException {
//        // setup("chrome", "https://www.amazon.com/");
//        // Click on Pharmacy Button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void books() throws InterruptedException {
//
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Books button
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
//        Thread.sleep(4000);
//
//    }
//
//    public static void bestSellers() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Best Sellers
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void coupons() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Coupons Button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void tvAndVideo() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        //  Click on TV & Video
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void petSupplies() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Pet Supplies Button
//        driver.findElement(By.className("nav-a")).click();
//        Thread.sleep(4000);
//    }
//
//    public static void checkDefaultDeliverAddressOfUser() throws InterruptedException {
//        // setUp("chrome","https://www.amazon.com/");
//        // Click on Deliver Location Icon
//        driver.findElement(By.id("glow-ingress-line1")).click();
//        // Click on zip code Button
//        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("11368");
//        System.out.println("Actual Text " + actualText);
//        String zipCode = driver.findElement(By.id("glow-ingress-line2")).getText();
//        System.out.println("Zip Code is " + zipCode);
//        // Click Apply Button
//        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
//
//        Thread.sleep(5000);
//
//    }


}

package amazon;


import base.FourthTestBase_01;

public class FourthBasicBuildUp_01 extends FourthTestBase_01 {

//    // Action method class
//
//    static String actualText;
//
//
//    /**
//     * This method should search the product in amazon searchBox
//     *
//     * @throws InterruptedException Author: Shebley
//     */
//    public static void searchBoxOnChrome() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        //   enter keyword in searchBox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        //  click on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // Verify searched product
//        //String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        String expectedText = "\"iPhone 14\"";
//        System.out.println("Expected Text : " + expectedText);
//
//        if (actualText.equals(expectedText)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//
//        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
//        if (actualProductName.equals(expectedProductName)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//        // driver.findElement(By.tagName("id Value"));
//        // Thread.sleep(10000);
//        //  driver.close();
//
//    }
//
//    /**
//     * This method should search the product in amazon searchBox
//     *
//     * @throws InterruptedException Author: Shebley
//     */
//    public static void searchBoxOnFireFox() throws InterruptedException {
//        //    setUp("fireFox","https://www.amazon.com/");
//        //   enter keyword in searchBox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//        //  click on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // Verify searched product
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        String expectedText = "\"iPhone 14\"";
//        System.out.println("Expected Text : " + expectedText);
//
//        if (actualText.equals(expectedText)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//
//        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
//        if (actualProductName.equals(expectedProductName)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//        // driver.findElement(By.tagName("id Value"));
//        // Thread.sleep(10000);
//        // driver.close();
//
//
//    }
//
//    /**
//     * This method will verify successful signIn using valid credential
//     *
//     * @throws InterruptedException Author: Shebley
//     */
//
//    public static void signIn() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        // Click on Hello SignIn
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        // Enter email/ phoneNumber
//        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
//        // Click continue button
//        driver.findElement(By.cssSelector("#continue")).click();
//        // Enter password
//        driver.findElement(By.name("password")).sendKeys("010407As");
//        // Click SignIn Button
//        driver.findElement(By.className("a-button-input")).click();
//        // Verify successful login
//        String expectedText = "Hello, Shebley";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
//        Thread.sleep(5000);
//        driver.close();
//
//
//    }
//
//    /**
//     * This method will verify unsuccessful signIn using Invalid credential and verify Error message
//     *
//     * @throws InterruptedException
//     */
//
//    public static void signInUsingInvalidCredential() throws InterruptedException {
//        //   setUp("chrome","https://www.amazon.com/");
//        // Click on Hello SignIn
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        // System.out.println("Hello");
//        // Enter email/ phoneNumber
//        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
//        // display();
//        // Click continue button
//        driver.findElement(By.cssSelector("#continue")).click();
//        // Enter password
//        driver.findElement(By.name("password")).sendKeys("010407As");
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
//        Thread.sleep(5000);
//        driver.close();
//
//    }
//
//    /**
//     * This method should navigateToYahoo
//     *
//     * @throws InterruptedException Author: Shebley
//     */
//    public static void navigateToYahoo() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.navigate().to("https://www.yahoo.com");
//        driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("Trump");
//        driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"yschsp\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"yschsp\"]")).sendKeys("Bush");
//        Thread.sleep(5000);
//
//        //  Thread.sleep(5000);
//    }


}

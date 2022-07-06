package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePage_My_Pactice10 {
    static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.amazon.com/";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {

        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest
    public void tearDownAutomation() {
        driver.close();
        System.out.println("***************** Automation End *******************");

    }

    @BeforeTest
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "fireFox") {
            setUpFireFoxBrowser();
        }

        //  navigate to amazon.com
        driver.get(this.url);
        driver.manage().window().maximize();

    }

    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../PracticeWebAutomation_QE_Winter2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("web_driver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public static void setUpFireFoxBrowser() {
        String fireFoxDriverPath = "../PracticeWebAutomation_QE_Winter2022/BrowserDriver/Windows/geckodriver.exe";
        System.setProperty("web_driver.gecko.driver", fireFoxDriverPath);
        driver = new FirefoxDriver();
    }

    @Test
    public static void testSearchBoxOnChrome() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        //String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        // driver.findElement(By.tagName("id Value"));
        // Thread.sleep(10000);
    }

    @Test(enabled = false)
    public static void testSearchBoxOnFireFox() {
        //    setUp("fireFox","https://www.amazon.com/");
        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // Verify searched product
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text : " + actualText);
        String expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        // driver.findElement(By.tagName("id Value"));
        // Thread.sleep(10000);

    }

    /**
     * This test method will verify successful signIn using valid credential
     *
     * @throws InterruptedException
     */
    @Test
    public static void testSignIn() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
        driver.findElement(By.name("password")).sendKeys("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // Click SignIn Button
        driver.findElement(By.className("a-button-input")).click();
        // Verify successful login
        String expectedText = "Hello, Shebley";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "SignIn not successful");
        Thread.sleep(5000);

    }

    /**
     * This test method will verify unsuccessful signIn using Invalid credential and verify Error message
     *
     * @throws InterruptedException
     */

    @Test
    public static void testSignInUsingInvalidCredential() throws InterruptedException {
        //   setUp("chrome","https://www.amazon.com/");
        // Click on Hello SignIn
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        // Enter email/ phoneNumber
        driver.findElement(By.id("ap_email")).sendKeys("shebleymsi@gmail.com");
        // Click continue button
        driver.findElement(By.cssSelector("#continue")).click();
        // Enter password
        driver.findElement(By.name("password")).sendKeys("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
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
        Thread.sleep(5000);
        driver.close();

    }


    @Test
    public static void amazonLogoIsClickAble() throws InterruptedException {
        // click on amazon logo
        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(5000);

    }

    @Test
    public static void notYetShipped() throws InterruptedException {
        // navigate to buy again page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
        // verify that by clicking Not Yet Shipped
        driver.findElement(By.xpath("//*[@id=\"CardInstancen1QWmby6RRCwQRh5tlZnVg\"]/div/div[3]/ul/li[3]/span/a")).click();
        Thread.sleep(5000);

    }

    @Test
    public static void BeautyAndPersonalCareIsClickAble() throws InterruptedException {
        // Navigate to Beauty and personal Care page by make a click from amazon home page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(5000);

    }

    @Test
    public static void BeautyAndPersonalCareNavigate() throws InterruptedException {
        // Navigate to Beauty and personal Care page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        // Navigate to hair care in Beauty and personal care department
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]")).click();
        Thread.sleep(5000);
    }

    @Test
    public static void HealthAndHouseHoldIsClickable() throws InterruptedException {
        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        Thread.sleep(5000);

    }

    @Test
    public static void HealthAndHouseHoldNavigate() throws InterruptedException {
        // Navigate to Health and HouseHold Page by make a click from amazon home page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        // Navigate to HouseHold cleaning
        driver.findElement(By.xpath("//*[@id=\"contentGrid_71816\"]/div/div/div[2]/div/div/a/img")).click();
        Thread.sleep(5000);


    }

    @Test
    public static void ShopperToolKit() throws InterruptedException {
        // setup("chrome", "\"https://www.amazon.com/\"");
        // Navigate to Shopper Tool Kit Page by make a click from amazon home pag
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        driver.findElement(By.className("nav-a-content")).click();
        String actualText = driver.findElement(By.className("a-size-extra-large a-spacing-micro")).getText();
        System.out.println("Actual Text " + actualText);
        Thread.sleep(10000);

    }

    @Test
    public static void LivestreamsAmazonLivelogo() throws InterruptedException {
        //    setUp("fireFox","https://www.amazon.com/");
        // Navigate to Livestremas button by make a click from amazon home page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        // Amazon Live logo is clickable
        driver.findElement(By.xpath("//*[@id=\"live-destination-aside\"]/aside/div/a/img"));
        //Verify Asia page landed successfully
        String expected = "Livestreams Amazon Live logo is clickable";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        Assert.assertEquals(actualText, expected, "Livestreams Amazon Live logo is clickable");
        Thread.sleep(5000);
        ;

    }

    @Test
    public static void AudibleTravelsAndTourismAsiaPage() throws InterruptedException {
        //    setUp("fireFox","https://www.amazon.com/");
        // Navigate to Livestremas Page by make a click from amazon home page
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        // Navigate to Audible Original check box is clickable
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li/span/a/div/label/i")).click();
        //  Navigate to Travel & Tourism button is clickable
        driver.findElement(By.xpath("//*[@id=\"n/18581095011\"]/span/a/span")).click();
        // Navigate to Asia button is clickable
        driver.findElement(By.xpath("//*[@id=\"n/18581098011\"]/span/a/span")).click();
        //Verify Asia page landed successfully
        String expectedText = "Asia page landed successfully";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        Assert.assertEquals(actualText, expectedText, "Asia page landed successfully ");
        Thread.sleep(5000);

    }

    @Test
    public static void CheckLocationOfUser() throws InterruptedException {
        // to check user's name and address in amazon header
        //    setUp("fireFox","https://www.amazon.com/");
        // Check for Delivered Person Button is clickable
        driver.findElement(By.id("glow-ingress-line1")).click();
        // check the name of the person
        String actualText = driver.findElement(By.id("glow-ingress-line1")).getText();
        System.out.println("Actual Text " + actualText);
        // check for user's zipcode
        // driver.findElement(By.id("glow-ingress-line2")).click();
        String zipCode = driver.findElement(By.id("glow-ingress-line2")).getText();
        System.out.println("Zip Code is " + zipCode);
        // this code will check for pop-up window of address
        driver.findElement(By.id("nav-global-location-popover-link")).click();
        // Verify user's name and address in amazon header
        String expectedText = "MD SHAHADUL ISLAM SHEBLEY, 104 33 39 TH AVE, CORONA, NY-11368";
        String actualText1 = driver.findElement(By.xpath("//*[@id=\"GLUXAddressList\"]/li/span/span/span/input")).getText();
        System.out.println("Actual Text : " + actualText1);
        Assert.assertEquals(actualText1, expectedText, "user's name and address is matched");
        Thread.sleep(5000);

    }

    @Test
    public void validUserShouldSignInSuccessfully() {
        // Click the "Hello, Sign in Accout & Lists" button.
        driver.findElement(By.xpath("bfdgfd")).click();
        // Click the " Sign-In" bar.
        // Enter valid Email or mobile phone number.
        // Click the "Continue" button.
        // Enter valid passwoard.
        //  Click the " Sign-In" bar.
        //  "Verify a valid or registered user should be sign in successfully and user last name displayed at the top right corner (beside the flag key) in the home page"

    }


}

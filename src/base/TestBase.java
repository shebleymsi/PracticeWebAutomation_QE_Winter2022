package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {
    // Configuration purpose


    public static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.amazon.com/";

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    // @AfterTest()
    @AfterMethod
    public void tearDownAutomation() {
        driver.close();
        System.out.println("***************** Automation End *******************");
    }

    // @BeforeTest
    @BeforeMethod
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "fireFox") {
            setUpFireFoxBrowser();
        }
        //  navigate to amazon.com
        driver.manage().window().maximize();
        driver.get(this.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
    }

    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../PracticeWebAutomation_QE_Winter2022/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public static void setUpFireFoxBrowser() {
        String fireFoxDriverPath = "../PracticeWebAutomation_QE_Winter2022/BrowserDriver/Windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        driver = new FirefoxDriver();
    }

    public static void display() {
        System.out.println("This is display");
    }


}

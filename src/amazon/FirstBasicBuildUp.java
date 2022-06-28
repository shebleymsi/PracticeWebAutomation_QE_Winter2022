package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstBasicBuildUp {

    // *************************** lecture video 41 ***************************


    @Test
    public static void testSearchBox() throws InterruptedException {


        String driverPath = "../PracticeWebAutomation_QE_Winter2022/BrowserDriver/Windos/chromedriver_win32/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();



        System.out.println("*******************          [SHEBLEY]      ***********************");



        //   enter keyword in searchBox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

        //  click on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();




        System.out.println("*******************          [SHEBLEY]      ***********************");




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


        System.out.println("*******************          [SHEBLEY]      ***********************");


        String actualProductName=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        String expectedProductName="Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        if (actualProductName.equals(expectedProductName)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }




        System.out.println("*******************          [SHEBLEY]      ***********************");




        Thread.sleep(10000);
        driver.close();



    }

}

package testAmazon;

import org.slf4j.Logger;
import org.testng.annotations.*;

public class LearnTestNG_02 {


// import static basic.HelloWorld.hello;  // NEXT : SHEBLEY


    // https://www.softwaretestinghelp.com/testng-annotations-in-selenium/

    @BeforeSuite
    public void beforeTestSuite() {
        System.out.println("************************ Before Test Suite ************************");
    }

    @BeforeTest
    public void preAutomationScript() {
        System.out.println("============ Pre Automation Script start Executing ==============");
    }

    @BeforeClass
    public void getSystemInformation() {
        System.out.println("============ System Information ==============");
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));
    }

    @BeforeMethod
    public void startAutomation() {
        System.out.println("**************** Start Automation *****************");
    }


    @AfterMethod
    public void endAutomation() {
        System.out.println("**************** End Automation *****************");
    }

    @AfterClass
    public void getTestDetails() {
        System.out.println("============ Test Details ==============");
    }

    @AfterTest
    public void postAutomationScript() {
        System.out.println("============ Post Automation Script start Executing ==============");
    }

    @AfterSuite
    public void afterTestSuite() {
        System.out.println("************************ After Test Suite ************************");
    }


    @Test(priority = 2)
    public void testSomething() {
        System.out.println("This is our Test something");

    }

    @Test(priority = 1)
    public void testSomething1() {
        System.out.println("This is our Test something1");

    }

    @Test(priority = 3, description = "Amazon signIn Test")
    public void testSomething2() {
        System.out.println("This is our Test something1");

    }

    @Test(priority = 4, description = "Amazon signIn Test", dependsOnMethods = {"testSomething", "testSomething1"})
    public void testSomething3() {
        System.out.println("This is our Test something1");

    }


    @Parameters({"number3", "number4"})
//    or @Parameters({"number3", "number4"}) Time : 03.52.51 V45
    @Test
    public void getSum(@Optional("2") int d, @Optional("3") int e) {
        int f = d + e;
        System.out.println("Summation value is : " + f);
    }

//   @Test  @Parameters({"12","13"})
//    public void testGetSum(int a,int b){
//        getSum(a,b);
//    }


     /*public void newTest(){  // NEXT : SHEBLEY
        hello();
    }*/

}


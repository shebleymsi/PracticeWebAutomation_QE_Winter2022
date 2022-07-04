package testAmazon;


import base.TestBase_02;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static amazon.AmazonHomePage_02.*;

public class AmazonHomePageTest_02 extends TestBase_02 {

    @Test
    public void testSearchBoxOnChrome() throws InterruptedException {
        searchBoxOnChrome();
    }


    @Test
    public static void testSignIn() throws InterruptedException {
        signIn();
    }





}

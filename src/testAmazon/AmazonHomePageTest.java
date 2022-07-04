package testAmazon;

import base.TestBase;
import org.testng.annotations.Test;

import static amazon.AmazonHomePage.*;

public class AmazonHomePageTest extends TestBase {

    // Test class

//    @Test
//    public void testNavigateToYahoo() throws InterruptedException {
//        navigateToYahoo();
//    }

    @Test
    public void testSearchBoxOnChrome() throws InterruptedException {
        searchBoxOnChrome();
    }

    @Test
    public void testSearchBoxOnFireFox() throws InterruptedException {
        searchBoxOnFireFox();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        signIn();
    }

    @Test(enabled = false)
    public void testSignInUsingInvalidCredential() throws InterruptedException {
        signInUsingInvalidCredential();
    }


}

package testAmazon;

import base.TestBase_02;
import org.testng.annotations.Test;

// import static amazon.AmazonHomePage_02.*;

import static amazon_02.AmazonSearchBoxFunctionalityOnChrome.*;
import static amazon_02.AmazonSearchBoxFunctionalityOnFireFox.*;
import static amazon_02.AmazonBasicFunctionality.*;
import static amazon_02.AmazonLogoIsClickAble.*;
import static amazon_02.AmazonSignInFunctionality.*;
import static amazon_02.AudibleFunctionality.*;
import static amazon_02.BeautyAndPersonalCareFunctionality.*;
import static amazon_02.BestSellersFunctionality.*;
import static amazon_02.BooksFunctionality.*;
import static amazon_02.BuyAgainFunctionality.*;
import static amazon_02.CouponsFunctionality.*;
import static amazon_02.AmazonCreateAccountFunctionality.*;
import static amazon_02.DeliverAddressOfUserFunctionality.*;
import static amazon_02.HealthAndHouseholdFunctionality.*;
import static amazon_02.LiveStreamsFunctionality.*;
import static amazon_02.NavigateToYahoo.*;
import static amazon_02.PetSuppliesFunctionality.*;
import static amazon_02.PharmacyFunctionality.*;
import static amazon_02.ShopperToolKitFunctionality.*;
import static amazon_02.TodaysDealsFunctionality.*;
import static amazon_02.TvAndVideoFunctionality.*;


public class AmazonHomePageTest_02 extends TestBase_02 {

    @Test
    public static void testNavigateToYahoo() throws InterruptedException {
        navigateToYahoo(); //01
    }

    @Test
    public void testSearchBoxOnChrome() throws InterruptedException {
        searchBoxOnChrome(); //02
    }

    @Test
    public static void testSearchBoxOnFireFox() throws InterruptedException {
        searchBoxOnFireFox(); //03
    }


    @Test
    public static void testSignIn() throws InterruptedException {
        signIn(); //04
    }

    @Test(enabled = false)
    public static void testCreateAccountFunctionalityCheckWithValidEmail() throws InterruptedException {
         createAccountFunctionalityCheckWithValidEmail(); // 05 not final but ok and done
    }
    @Test
    public static void testSignInUsingInvalidCredential() throws InterruptedException {
        signInUsingInvalidCredential(); //06

    }

    @Test
    public static void testAmazonLogoIsClickAble() throws InterruptedException {
        amazonLogoIsClickAble(); //07

    }

    @Test
    public static void testLiveStreams() throws InterruptedException {
        liveStreams(); //08

    }

    @Test
    public static void testHealthAndHousehold() throws InterruptedException {
        healthAndHousehold(); //09
    }

    @Test

    public static void testAudible() throws InterruptedException {
        audible(); //10

    }


    @Test
    public static void testBeautyAndPersonalCare() throws InterruptedException {
        beautyAndPersonalCare(); //11
    }

    @Test
    public static void testTodaysDeals() throws InterruptedException {
        todaysDeals(); //12
    }

    @Test
    public static void testAmazonBasic() throws InterruptedException {
        amazonBasic(); //13
    }

    @Test
    public static void testBuyAgain() throws InterruptedException {
        buyAgain(); //14
    }

    @Test
    public static void testShopperToolKit() throws InterruptedException {
        shopperToolKit(); //15
    }

    @Test
    public static void testPharmacy() throws InterruptedException {
        pharmacy(); //16
    }

    @Test
    public static void testBooks() throws InterruptedException {
        books(); //17
    }

    @Test
    public static void testBestSellers() throws InterruptedException {
        bestSellers(); //18
    }

    @Test
    public static void testCoupons() throws InterruptedException {
        coupons(); //19
    }

    @Test
    public static void testTvAndVideo() throws InterruptedException {
        tvAndVideo(); //20
    }

    @Test
    public static void testPetSupplies() throws InterruptedException {
        petSupplies(); //21
    }

    @Test
    public static void testCheckDefaultDeliverAddressOfUser() throws InterruptedException {
        checkDefaultDeliverAddressOfUser(); // 22
    }




}

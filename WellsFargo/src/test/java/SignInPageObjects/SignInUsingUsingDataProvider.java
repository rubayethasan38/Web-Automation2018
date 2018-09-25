package SignInPageObjects;

import Home.HomeHelper;
import Home.SignInHelper;
import Home.SmallBussiness;
import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;


import java.util.ArrayList;
import java.util.Iterator;

public class SignInUsingUsingDataProvider extends SignInHelper {
    HomeHelper objOfHomePage;
    SignInHelper objOfSignInPage;

    @BeforeMethod
    public void init() {
        objOfHomePage = PageFactory.initElements(webDriver, HomeHelper.class);
        objOfSignInPage = PageFactory.initElements(webDriver, SignInHelper.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData() {
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        objOfSignInPage.signInButton();
        TestLogger.log("In Sign In Page");
        objOfSignInPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");
    }
}
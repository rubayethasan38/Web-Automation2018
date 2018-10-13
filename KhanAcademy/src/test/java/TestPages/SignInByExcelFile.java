package TestPages;

import HomePackage.LoginPage;
import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class SignInByExcelFile extends LoginPage {

   LoginPage loginPage;


   @BeforeMethod
    public void initializationOfElements() {
        loginPage  = PageFactory.initElements(webDriver, LoginPage.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();
    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);
        loginPage.loginpage();
        TestLogger.log("In Sign In Page");
        loginPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");
    }
}

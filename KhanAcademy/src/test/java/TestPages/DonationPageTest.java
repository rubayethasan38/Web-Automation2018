package TestPages;

import HomePackage.DonationPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DonationPageTest extends DonationPage {
@BeforeMethod
public void initDonation(){
    DonationPage donationPage= PageFactory.initElements(webDriver,DonationPage.class);
}
    @Test
    public void clickDonate() {  TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    donateTenDollers();
}
    @Test
    public void giveUserName() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    typeInName();
    }
}

package TestPages;

import HomePackage.DonationPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DonationPageTest extends DonationPage {
@BeforeMethod
public void initDonation(){
    DonationPage donationPage= PageFactory.initElements(webDriver,DonationPage.class);
}
    @Test
    public void clickDonate() { donatetendollers();
}
    @Test
    public void giveUserName() {typeUseName();}
}

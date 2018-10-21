package PageTest;
import Page.Mobile;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class MobileTest extends Mobile {
    Mobile mobile = PageFactory.initElements(webDriver, Mobile.class);
    @Test
    public void FirstTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mobile.clickOnMobileUnlockedCellPhones();
    }
    @Test
    public void SecondTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mobile.clickOnMobileiPadsMediaTablets();
    }
    @Test
    public void ThirdTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mobile.clickOnMobileWearableTechnology();
    }
    @Test
    public void FourthTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mobile.clickOnMobileCellPhoneAccessories();
    }
    @Test
    public void FifthTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    mobile.clickOnMobileTabletAccessories();
    }
}

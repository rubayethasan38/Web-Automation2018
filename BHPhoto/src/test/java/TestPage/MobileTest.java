package TestPage;

import Page.Mobile;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MobileTest extends Mobile {
    @Test
    public void FirstTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnMobileUnlockedCellPhones();
    }
    @Test
    public void SecondTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMobileiPadsMediaTablets();
    }
    @Test
    public void ThirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMobileWearableTechnology();
    }
    @Test
    public void FourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMobileCellPhoneAccessories();
    }
    @Test
    public void FifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMobileTabletAccessories();
    }
}

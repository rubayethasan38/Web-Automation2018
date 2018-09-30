package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ServicesTest extends HomeHelper {

    HomeHelper ObjOfHomeHelper;
    @BeforeMethod
    public void init (){
        ObjOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test
    public void applyForStudentLoanTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomeHelper.applyForStudentLoan();
    }
    @Test
    public void collectionsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomeHelper.collections();
    }
    @Test
    public void makeQuickDepositTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomeHelper.quickDeposit();
    }

}

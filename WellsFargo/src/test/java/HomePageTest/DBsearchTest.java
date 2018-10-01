package HomePageTest;

import Home.DataBase;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DBsearchTest extends DataBase {

   DataBase dataBase;
    @BeforeMethod
   public void init(){
        dataBase = PageFactory.initElements(webDriver, DataBase.class);
    }
    @Test
    public void searchByDBTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchByDB();
    }
    @Test
    public void multipleByDBTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchByDBmultiple();
    }
}
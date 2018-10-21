package DataReaderTest;
import DataReader.ExcelFileReader;
import Database.SearchData;
import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import sun.jvm.hotspot.debugger.Page;
import java.util.ArrayList;
import java.util.Iterator;
public class ExcelFileReaderTest extends ExcelFileReader {
    Page objOfPage;
     SearchData searchData;
    @BeforeMethod
    public void initializePageObject() {
        //objExcelFile = PageFactory.initElements(webDriver, ExcelFileReaderTest.class);
        searchData = PageFactory.initElements(webDriver, SearchData.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyDataExcel() {
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void searchTest(String items) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //  objExcelFile.xcelElement.signInByDataProvider(items);
        String actual = SearchData.search.getText();
        TestLogger.log("Search successful");
        //Assert.assertEquals(message,errormessage);
    }
}

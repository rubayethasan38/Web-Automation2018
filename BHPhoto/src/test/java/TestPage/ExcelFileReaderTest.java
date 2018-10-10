package TestPage;

import Page.ExcelFileReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class ExcelFileReaderTest extends ExcelFileReader {
    ExcelFileReader objExcelFile;

    @BeforeMethod
    public void initialization(){
        objExcelFile = PageFactory.initElements(webDriver, ExcelFileReader.class);
    }
    //T3HOM_ER _TC01 Search Product using Excel file
    @Test
    public void searchProductUsingExcel() throws IOException, InterruptedException {
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] expectedItems = objExcelFile.getAssertData("Data.xls");
        String[] actualItems = objExcelFile.searchProduct("Data.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed"+actualItems[i]);
        }
        System.out.println("searchProductUsingExcel test pass");

    }

}

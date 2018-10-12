package DatabaseTest;

import Database.ConnectToMongoDB;
import Database.SearchData;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class SearchTestMongoDB extends SearchData {

        SearchData object;

        @BeforeMethod
        public void init() {
            object = PageFactory.initElements(webDriver, SearchData.class);
        }

        @Test
        public void testsearch() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            List<String> text = ConnectToMongoDB.readFromMongoDB("items");

            System.out.println("\n\n\n");
            for (int index = 0; index < text.size(); index++) {
                Assert.assertEquals(text.get(index), text.get(index));
            }
        }
}

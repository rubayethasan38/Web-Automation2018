package HomePageTest;

import Home.DataBase;
import org.testng.annotations.Test;

public class DBsearchTest extends DataBase {
    @Test
    public void testSearchByDB() throws Exception {
        searchByDB();
    }
    @Test
    public void testMultipleByDB() throws Exception {
        searchByDBmultiple();
    }
}
package Home;

import base.CommonAPI;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;


public class DataBase extends CommonAPI {
    //insert data to db
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("ATM");
        itemsList.add("Branch near me ");
        itemsList.add("Online Banking");
        return itemsList;
    }
    //put Data to DB-Mysql
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(getItemValue(), "WellsFargo", "search");
    }
    //insert data to db
    public static List<String> setUserName() {
        List<String> username = new ArrayList<String>();
        username.add("user1");
        username.add("user2");
        username.add("user3");
        return username;
    }
    public static List<String> setUserPass() {
        List<String> passWord = new ArrayList<String>();
        passWord.add("343434");
        passWord.add("44343");
        passWord.add("55555");
        passWord.add("44444");
        passWord.add("P5555");
        passWord.add("55555");
        passWord.add("55555");
        return passWord;
    }
    //bring data from db and search using them
    public void searchByDB() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(getItemValue(),"WellsFargo","search");
        List<String> items = connectToSqlDB.readDataBase("WellsFargo", "search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//*[@id=\"inputTopSearchField\"]", items.get(i));
            clearInputByXpath("//*[@id=\"inputTopSearchField\"]");
        }
    }
    //bring data from db and input them
    public void searchByDBmultiple() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> items = connectToSqlDB.readDataBase("WellsFargo", "search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpath("//*[@id=\"userid\"]", items.get(i));
            Thread.sleep(2000);
            clearInputByXpath("//*[@id=\"password\"]");
        }
    }
}


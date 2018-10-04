package Key;

import Page.ExcelFileReader;
import Page.AllCategories;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {
    ExcelFileReader objExcelFileReader;
    AllCategories objAllCategories;
    LoginPage objLoginPage;


    public void applianceItems(){
        objAllCategories = PageFactory.initElements(driver, AllCategories.class);
        objAllCategories.goToAppliances();
        System.out.println("Appliance test pass");
    }
    public void bathroomItems(){
        objAllCategories = PageFactory.initElements(driver, AllCategories.class);
        objAllCategories.goToBathroomUsingImg();
        System.out.println("Bathroom test pass");
    }
    public void invalidEmail(){
        objLoginPage = PageFactory.initElements(driver, LoginPage.class);
        objAllCategories = PageFactory.initElements(driver, AllCategories.class);
        objAllCategories.goToLoginPage();
        objLoginPage.enterInvalidEmail();
        System.out.println("InvalidEmail test pass");
    }
    public String[] generalSearch(String fileName) throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
        String[] title = objExcelFileReader.searchProduct(fileName);
        System.out.println("ExcelfileReader test pass");
        return title;
    }
    public void select(String featureName) throws IOException, InterruptedException {
        switch(featureName){
            case "applianceItems":
                applianceItems();
                break;zzzzz
            case "bathroomItems":
                bathroomItems();
                break;
            case "invalidEmail":
                invalidEmail();
                break;
            case "generalSearch":
                generalSearch("Data.xls");
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
        String[] title = objExcelFileReader.getDatafromExcelFileForFeatureChoice("DataFeature1.xls");
        for(int i=0;i<title.length;i++){
            select(title[i]);
        }
    }
}
}

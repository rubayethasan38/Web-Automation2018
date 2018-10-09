package Key;

import Page.*;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {
    ExcelFileReader objExcelFileReader;
    Account objAccountPage;
    AudioVisual objAudioVisual;
    Camera objCamera;
    Computer objComputer;
    Footer objFooter;
    FooterB objFooterB;
    FooterC objFooterC;
    Lighting objLighting;
    Mobile objMobile;
    Optics objOptics;
    ProAudio objProAudio:
    TVEntertainment objTVEntertainment;


    public void applianceItems(){
        objAccountPage = PageFactory.initElements(WebDriver, Account.class);
        objAccountPage.goToAppliances();
        System.out.println("Appliance test pass");
    }
    public void bathroomItems(){
        objAudioVisual = PageFactory.initElements(WebDriver, HomePage.class);
        objAudioVisual.goToBathroomUsingImg();
        System.out.println("Bathroom test pass");
    }
    public void invalidEmail(){
        objComputer = PageFactory.initElements(WebDriver, LoginPage.class);
        objComputer = PageFactory.initElements(WebDriver, HomePage.class);
        objHomePage.goToLoginPage();
        objLoginPage.enterInvalidEmail();
        System.out.println("InvalidEmail test pass");
    }
    public String[] generalSearch(String fileName) throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(WebDriver, ExcelFileReader.class);
        String[] title = objExcelFileReader.searchProduct(fileName);
        System.out.println("ExcelfileReader test pass");
        return title;
    }
    public void select(String featureName) throws IOException, InterruptedException {
        switch(featureName){
            case "applianceItems":
                applianceItems();
                break;
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
        objExcelFileReader = PageFactory.initElements(WebDriver, ExcelFileReader.class);
        String[] title = objExcelFileReader.getDatafromExcelFileForFeatureChoice("DataFeature1.xls");
        for(int i=0;i<title.length;i++){
            select(title[i]);
        }
    }
}

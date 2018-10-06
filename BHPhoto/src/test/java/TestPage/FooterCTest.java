package TestPage;

import Page.FooterC;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FooterCTest extends FooterC {
    @Test
    public void AboutUs () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setAboutUs();
    }
    @Test
    public void NationalWorkshops () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setNationalWorkshops();
    }
    @Test
    public void ReviewsAwards () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setReviewsAwards();
    }
    @Test
    public void AffiliateProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setAffiliateProgram();
    }
    @Test
    public void SupplierDiversityProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSupplierDiversityProgram();
    }
    @Test
    public void CareerOpportunities () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setCareerOpportunities();
    }
    @Test
    public void ShopByBrand () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setShopByBrand();
    }
    @Test
    public void ManufacturesDirectory () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setManufacturesDirectory();
    }
    @Test
    public void SourcebooksCatalogs () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSourcebooksCatalogs();
    }
}

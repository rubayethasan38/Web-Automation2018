package TestPage;

import Page.FooterB;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FooterBTest extends FooterB {
    @Test
    public void TrackRequestReturn () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setTrackRequestReturn();
    }
    @Test
    public void UnsubscribeCatalog () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setUnsubscribeCatalog();
    }
    @Test
    public void UnsubscribeEmail () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setUnsubscribeEmail();
    }
    @Test
    public void Payments () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setPayments();
    }
    @Test
    public void AllHelpTopics () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setAllHelpTopics();
    }
    @Test
    public void WorldwideShipping () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setWorldwideShipping();
    }
    @Test
    public void PaymentOptions () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setPaymentOptions();
    }
    @Test
    public void CustomsVAT () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
       setCustomsVAT();
    }
}

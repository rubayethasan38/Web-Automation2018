package PageTest;
import Page.ProVideo;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class ProVideoTest extends ProVideo {
    ProVideo proVideo = PageFactory.initElements(webDriver, ProVideo.class);
    @Test
    public void FirstTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        proVideo.clickOnProVideoCamcorders();
    }
    @Test
    public void SecondTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proVideo.clickOnProVideoDigitalCineCamera();
    }
    @Test
    public void ThirdTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proVideo.clickOnProVideoTelevisionStudioEFPCameras();
    }
    @Test
    public void FourthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proVideo.clickOnProVideoBroadcastVideoCameras();
    }
    @Test
    public void FifthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proVideo.clickOnProVideoIndustrialMultiPurposeCameras();
    }
}

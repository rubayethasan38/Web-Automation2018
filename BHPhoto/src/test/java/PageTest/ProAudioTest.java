package PageTest;
import Page.ProAudio;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ProAudioTest extends ProAudio {
    ProAudio proAudio = PageFactory.initElements(webDriver, ProAudio.class);
    @Test
    public void FirstTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        proAudio.clickOnProAudioProRecording();
    }
    @Test
    public void SecondTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proAudio.clickOnProAudioComputer();
    }
    @Test
    public void ThirdTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proAudio.clickOnProAudioLocationSoundAudioEquipment();
    }
    @Test
    public void FourthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proAudio.clickOnProAudioLiveSound();
    }
    @Test
    public void FifthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        proAudio.clickOnProAudioMicrophones();
    }
}

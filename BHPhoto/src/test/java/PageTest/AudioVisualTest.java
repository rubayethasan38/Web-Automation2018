package PageTest;
import Page.AudioVisual;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class AudioVisualTest extends AudioVisual {
    AudioVisual audioVisual = PageFactory.initElements(webDriver, AudioVisual.class);
    @Test
    public void fiftyTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        audioVisual.clickOnAudioVisualProjectors();
    }
    @Test
    public void fiftyoneTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        audioVisual.clickOnAudioVisualMultimediaProjectorScreens();
    }
    @Test
    public void fiftytwoTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        audioVisual.clickOnAudioVisualCommercialMonitorsDisplays();
    }
    @Test
    public void fiftythreeTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        audioVisual.clickOnAudioVisualVideoPresentersAccessories();
    }
    @Test
    public void fiftyfourTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        audioVisual.clickOnAudioVisualWhiteboardsEasels();
    }
}

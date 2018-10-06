package TestPage;



import Page.AudioVisual;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AudioVisualTest extends Page.AudioVisual {
    @Test
    public void fiftyTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisualProjectors();
    }
    @Test
    public void fiftyoneTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisualMultimediaProjectorScreens();
    }
    @Test
    public void fiftytwoTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisualCommercialMonitorsDisplays();
    }
    @Test
    public void fiftythreeTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisualVideoPresentersAccessories();
    }
    @Test
    public void fiftyfourTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisualWhiteboardsEasels();
    }

}

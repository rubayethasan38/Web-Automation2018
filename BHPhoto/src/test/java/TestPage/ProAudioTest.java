package TestPage;

import Page.ProAudio;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ProAudioTest extends ProAudio {
    @Test
    public void FirstTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnProAudioProRecording();
    }
    @Test
    public void SecondTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProAudioComputer();
    }
    @Test
    public void ThirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProAudioLocationSoundAudioEquipment();
    }
    @Test
    public void FourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProAudioLiveSound();
    }
    @Test
    public void FifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProAudioMicrophones();
    }
}

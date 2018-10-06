package TestPage;

import Page.Computer;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ComputerTest extends Computer {
    @Test
    public void sixthTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnComputersLaptops();
    }
    @Test
    public void seventhTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnComputersMac();
    }
    @Test
    public void eightTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnComputersiPadsMediaTablets();
    }
    @Test
    public void ninthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnComputersDesktopsWorkstations();
    }
    @Test
    public void tenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnComputersComponents();
    }
}

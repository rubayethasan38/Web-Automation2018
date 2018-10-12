package PageTest;

import Page.Computer;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ComputerTest extends Computer {
    Computer computer = PageFactory.initElements(webDriver, Computer.class);
    @Test
    public void sixthTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        computer.clickOnComputersLaptops();
    }
    @Test
    public void seventhTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        computer.clickOnComputersMac();
    }
    @Test
    public void eightTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        computer.clickOnComputersiPadsMediaTablets();
    }
    @Test
    public void ninthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        computer.clickOnComputersDesktopsWorkstations();
    }
    @Test
    public void tenthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        computer.clickOnComputersComponents();
    }
}

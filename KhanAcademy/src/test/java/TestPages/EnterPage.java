package TestPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EnterPage extends CommonAPI {
    @Test
    public void loginAccount() {
        webDriver.findElement(By.xpath("//*[@id=\"login-or-signup\"]")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void singup(){
        webDriver.findElement(By.xpath("//*[@id=\"geometry\"]")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"subjects\"]/div/div/div/div/div[3]/div[1]/a/div[1]/div/span/img")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[2]/div/div/div[1]/h2/a")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"euclid-as-the-father-of-geometry-Video-tab\"]")).click();
        webDriver.findElement(By.cssSelector("#v\\2f euclid-as-the-father-of-geometry-panel > div:nth-child(1) > div > div.videoBackdrop_j7g7se > div > div.ka-video-player.ka-video-player-math.root_1h8259z-o_O-noOutline_fxofu2 > div > div.playButtonContainer_1cq9gbi > button > svg > path")).click();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector("#player_uid_570701815_1 > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-left-controls > button")).click();
//        webDriver.findElement(By.xpath("//*[@id=\"player_uid_865218609_1\"]/div[20]/div[2]/div[1]/button")).click();
    }

}

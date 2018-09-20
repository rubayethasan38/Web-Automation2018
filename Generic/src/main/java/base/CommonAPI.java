package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver webDriver = null;
    @Parameters({"url"})
    @BeforeMethod

    public void loginPage (@Optional("https://www.bhphotovideo.com/") String url) {

        System.setProperty("webdriver.chrome.driver", "/Users/RSH/Selenium2018/WebAutomation/Generic/driver/chromedriver");
                webDriver = new ChromeDriver();
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                webDriver.get(url);


    }
    @AfterMethod

    public void logoutPage () {
        // webdriver.close();
    }
}

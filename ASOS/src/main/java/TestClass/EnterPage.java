package TestClass;


import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EnterPage extends CommonAPI {
    @Test
    public void check(){
        webDriver.findElement(By.xpath("//*[@id=\"chrome-sticky-header\"]/div[1]/div/ul[1]/li[2]/a")).click();

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div._2tINcUI > div > ul._2htQAml._3nGd4mQ > li:nth-child(2) > a")).click();

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div:nth-child(2) > div:nth-child(2) > nav > div > div._3r7rW4o > button:nth-child(5) > span > span")).click();

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div:nth-child(2) > div:nth-child(2) > nav > div > div._3r7rW4o > button:nth-child(2) > span > span")).click();

        webDriver.findElement(By.cssSelector("#chrome-search")).sendKeys("Jackets", Keys.ENTER);

        webDriver.findElement(By.cssSelector("#product-10113673 > a > div._1FN5N-P > img")).click();

        webDriver.findElement(By.cssSelector("#product-add > div > a > span:nth-child(2)")).click();

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div._2tINcUI > div > ul._1OLInBo > li:nth-child(3) > a > span > svg")).click();

        webDriver.findElement(By.cssSelector("#chrome-search")).sendKeys("Shoes", Keys.ENTER);
    }
}



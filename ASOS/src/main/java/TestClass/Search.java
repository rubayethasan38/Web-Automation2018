package TestClass;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Search extends CommonAPI {
    @Test
    public void check(){
        webDriver.findElement(By.cssSelector("#chrome-search")).sendKeys("Accessories", Keys.ENTER);

        webDriver.findElement(By.cssSelector("#product-10514937 > a > div._1FN5N-P > img")).click();

        webDriver.findElement(By.cssSelector("#chrome-footer > footer > div.SKoJwiD > div._1gmIo4T > div > details:nth-child(2) > a:nth-child(2)")).click();

        webDriver.findElement(By.cssSelector("body > section.mu-section.is-small.no-padding-desktop.no-padding-mobile > article:nth-child(1) > div.moment__textSection > div.moment__buttons > a > span")).click();

        webDriver.findElement(By.cssSelector("#chrome-search")).sendKeys("Watches", Keys.ENTER);

        webDriver.findElement(By.cssSelector("#product-9544681 > a > div._1FN5N-P > img")).click();

        webDriver.findElement(By.cssSelector("#product-details > div > div.show-more > div > a.show")).click();

        }

        @Test
    public void clickAsos () {
        webDriver.findElement(By.xpath("//*[@id=\"chrome-sticky-header\"]/div[1]/div/a"));

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div._2tINcUI > div > a > svg > path")).click();

        webDriver.findElement(By.xpath("//*[@id=\"chrome-sticky-header\"]/div[2]/div[1]/nav/div/div[1]/button[2]"));

        webDriver.findElement(By.cssSelector("#chrome-sticky-header > div._2tINcUI > div > ul._2htQAml._3nGd4mQ > li:nth-child(2) > a")).click();

        webDriver.findElement(By.cssSelector("body > section:nth-child(23) > article:nth-child(2) > div.moment__textSection > div.moment__buttons > a > span")).click();


        }


}

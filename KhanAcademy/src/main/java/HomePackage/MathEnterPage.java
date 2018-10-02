package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MathEnterPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"geometry\"]")
    public static WebElement homaPage;
    @FindBy(css = "#\\2f math > div.exceptPhone_wrjbrc > h2 > a > div")
    public static WebElement selectMath;
    @FindBy (className = "link_1uvuyao")
    public static WebElement geometry;
    @FindBy(xpath = "//*[@id=\"precalculus\"]")
    public static WebElement preCalculas;
    @FindBy(xpath = "//*[@id=\"algebra2\"]")
    public static WebElement algebra2;

    //methods
    public void mainPage () { homaPage.click();}
    public void math () {selectMath.click();}
    public void selectGeometry () { geometry.click();}
    public void clickPrecalculas() {preCalculas.click();}
    public void subAlgebra2 () {algebra2.click();}
}

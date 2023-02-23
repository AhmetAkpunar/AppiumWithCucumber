package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageN11;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class StepDef_N11 {


    /*

        Thread.sleep(3000);
        driver.findElementByXPath("//*[@class='android.widget.EditText']").click();
        driver.findElementByXPath("//*[@class='android.widget.EditText']").sendKeys("iphone 14");
        driver.findElementByXPath("(//*[@text='iphone 14'])[2]").click();
        //driver.findElementByXPath("//*[@class='android.widget.EditText']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("(//*[@class='android.widget.Button'])[1]").click();
        Thread.sleep(2000);
        /*
        driver.findElementByAccessibilityId("Renk Siyah ve 44.499,00 TL seçili").click();

        driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Renk Siyah ve 44" +
                                          ".499,00 TL seçili\"]").click();

    //driver.findElementById("com.pozitron.hepsiburada:id/atcb_product_variant").click();
        driver.findElementByXPath("//*[@text='Sepete Ekle']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("com.pozitron.hepsiburada:id/nav_graph_cart").click();
        Thread.sleep(2000);
    String actual =driver.findElementByXPath("(//android.view.View[@content-desc=\"iPhone 14 " +
                                                     "Pro Max 128 GB\"])[2]/android.widget.TextView").getText();

     */

        PageN11 pageN11 = new PageN11();
        AndroidDriver<AndroidElement> driver;
        static WebDriverWait wait;

    @Before
    public void driverSetUp(){
        driver = pageN11.getDriver();

    }

    @Given("User launches n11 mobile app")
    public void user_launches_n11_mobile_app() {
        driver.findElement(pageN11.searchBox).click();
    }
    @Given("search {string}")
    public void search(String item) {
        driver.findElement(pageN11.searchText).sendKeys(ConfigReader.getProperty("item"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.hideKeyboard();
        driver.findElement(pageN11.addToBasket).click();
    }

    @Given("select color  {string}")
    public void select_color(String color) {
      driver.findElement(pageN11.color).click();
    }
    @Given("select memory  {string}")
    public void select_memory(String memory) {
        driver.findElement(pageN11.memory).click();
    }

    @Given("Adds product to the cart")
    public void adds_product_to_the_cart() {
        driver.findElement(pageN11.sepeteEkle).click();
    }
    @Given("Verify that the product is in the cart")
    public void verify_that_the_product_is_in_the_cart() {
        driver.findElement(pageN11.sepetim).click();
        String expectedTxt = ConfigReader.getProperty("item");
        String actualTxt = driver.findElement(pageN11.itemTitle).getText();
        System.out.println("actualTxt = " + actualTxt);
        System.out.println("expectedTxt = " + expectedTxt);
        Assert.assertTrue(actualTxt.contains(expectedTxt));

    }
    /*
    @Given("Verify that product is in the cart")
    public void verify_that_product_is_in_the_cart() {
        driver.findElement(pageN11.sepetim).click();
        ReusableMethods.bekle(2);
        String expectedTxt = ConfigReader.getProperty("item");
        String actualTxt = driver.findElement(pageN11.itemTitle).getText();
        System.out.println("actualTxt = " + actualTxt);
        System.out.println("expectedTxt = " + expectedTxt);
        Assert.assertTrue(actualTxt.contains(expectedTxt));

    }

     */







}

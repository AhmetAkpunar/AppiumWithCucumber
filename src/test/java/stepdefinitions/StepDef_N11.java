package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PageN11;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class StepDef_N11 {

        PageN11 pageN11 = new PageN11();
        AndroidDriver<AndroidElement> driver;
        AndroidTouchAction action ;

    @Before
    public void driverSetUp(){driver = pageN11.getDriver();}

    @Given("launch n11 mobile app")
    public void launch_n11_mobile_app() {
        driver.findElement(pageN11.searchBox).click();
    }

    @Given("search {string}")
    public void search(String item) {
        driver.findElement(pageN11.searchText).sendKeys(ConfigReader.getProperty("item"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.hideKeyboard();
    }

    @Given("select color  {string}")
    public void select_color(String color) {driver.findElement(pageN11.color).click();}

    @Given("select memory  {string}")
    public void select_memory(String memory) {driver.findElement(pageN11.memory).click();}

    @Given("add product to the cart")
    public void add_product_to_the_cart() {
        driver.findElement(pageN11.addToBasket).click();
    }

    @Given("verify that the product is in the cart")
    public void verify_that_the_product_is_in_the_cart() {
        driver.findElement(pageN11.sepetim).click();
        driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        ReusableMethods.waitForIt(2);
        String expectedTxt = ConfigReader.getProperty("item");
        String actualTxt = driver.findElement(pageN11.itemTitle).getText();
        System.out.println("expectedTxt = " + expectedTxt);
        System.out.println("=============================");
        System.out.println("expectedTxt = " + expectedTxt);
        System.out.println("actualTxt = " + actualTxt);
        Assert.assertTrue(actualTxt.contains(expectedTxt));
    }


}

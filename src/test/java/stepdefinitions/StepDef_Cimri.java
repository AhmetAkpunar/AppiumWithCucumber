package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.PageCimri;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDef_Cimri {

    AndroidDriver<AndroidElement> driver;

    PageCimri pageCimri = new PageCimri();

    /*
    @Before
    public void driverSetUp(){driver = PageCimri.getDriver();}

     */

    @Given("launch {string} mobile app")
    public void launchMobileApp(String cimri) {
        driver = PageCimri.getDriver();
    }

    @Then("click sport and outdoor")
    public void click_sport_and_outdoor() {
        ReusableMethods.waitForIt(5);
     driver.findElement(pageCimri.sporOutdoor).click();

    }
    @Then("click mountain bikes")
    public void click_mountain_bikes() {
      driver.findElement(pageCimri.bisiklet).click();
    }
    @Then("click electricity bikes")
    public void click_electricity_bikes() {
      driver.findElement(pageCimri.elektrikliB).click();

    }
    @Then("click sort price from low to high")
    public void click_sort_price_from_low_to_high() {
        driver.findElement(pageCimri.siralama).click();
        driver.findElement(pageCimri.siralamForm).click();
        ReusableMethods.waitForIt(2000);
        driver.findElement(pageCimri.dusukFiyat);
    }
    @And("verify that prices sorted from low to high")
    public void verify_that_prices_sorted_from_low_to_high() {

        String enDusukFyt = driver.findElement(pageCimri.enDusukFiyat).getText();
        String ikinciDusukFyt = driver.findElement(pageCimri.ikinciDusFiyat).getText();

    }



}

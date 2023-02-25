package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import pages.PageCimri;
import utilities.ReusableMethods;

public class StepDef_Cimri {


    PageCimri pageCimri = new PageCimri();
    public static AndroidDriver<AndroidElement> driver;

    @Before
    public void driverSetUp(){
        pageCimri.getDriver();
    }

    @Given("launch cimri mobile app")
    public void launch_cimri_mobile_app() {
        ReusableMethods.waitForIt(2000);
    }
    @Then("click sport and outdoor")
    public void click_sport_and_outdoor() {
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

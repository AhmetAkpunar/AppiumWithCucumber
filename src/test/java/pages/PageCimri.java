package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class PageCimri {

    public static AndroidDriver<AndroidElement> driver;

    public AndroidDriver<AndroidElement> getDriver(){

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("appPackage","com.cimrimobilevoyager");
        caps.setCapability("appActivity","com.cimrimobilevoyager.MainActivity");

        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }

    // outdoor category
    public By sporOutdoor = By.xpath("//android.view.View[@content-desc=\"Spor, Outdoor\"]");
    public By bisiklet = By.xpath("//android.view.View[@content-desc=\"bisikletler Bisikletler (7.487 ürün)\"]/android.view" +
                                          ".View");

    public By elektrikliB = By.xpath("//android.view.View[@content-desc=\"elektrikli-bisikletler Elektrikli Bisikletler (59 " +
                                            "ürün)" +
                                      "\"]/android.view.View");
    public By siralama = By.id("sorting");

    public By siralamForm = By.xpath("//*[@resource-id='sort-form']");

    public By dusukFiyat = By.xpath("(//android.view.View[@class='android.view.View'])[21]");

    public By enDusukFiyat= By.xpath("//android.view.View[@content-desc=\"Arora 60V 60-80 Ah Üç Teker Kasalı Elektrikli " +
                                             "Bisiklet" +
                                            " " +
                                        "Şarj" +
                                       " " +
                                      "Aleti 564,90 TL + 1 fiyat teklifi\"]/android.widget.TextView[1]");
    public By ikinciDusFiyat = By.xpath("//android.view.View[@content-desc=\"Arora Bora Elektrikli Bisiklet 1.750,00 TL + 1 " +
                                               "fiyat" +
                                              " " +
                                         "teklifi\"]/android.widget.TextView[1]");
}

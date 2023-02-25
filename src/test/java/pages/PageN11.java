package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PageN11 {

    public static AndroidDriver<AndroidElement> driver;

    public AndroidDriver<AndroidElement> getDriver(){

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("appPackage","com.dmall.mfandroid");
        caps.setCapability("appActivity","com.dmall.mfandroid.activity.base.NewSplash");

        try {
            driver =new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;

    }

    public By searchBox = By.id("com.dmall.mfandroid:id/ivLogoHomeSearchBar");
    public By searchText = By.id("com.dmall.mfandroid:id/etSearch");
    public By touchOutside = By.id("com.dmall.mfandroid:id/touch_outside");
    public By color = By.xpath("//*[@text='Mor']");
    public By memory = By.xpath("//*[@text='128 GB']");
    public By addToBasket = By.xpath("(//*[@resource-id ='com.dmall.mfandroid:id/ivAddToBasket'])[1]");
    public By sepeteEkle = By.id("com.dmall.mfandroid:id/continueButton");
    public By sepetim = By.id("com.dmall.mfandroid:id/navigation_basket");
    public By itemTitle = By.id("com.dmall.mfandroid:id/basketItemTitleTV");

    //accessibiliyId = Sepetim, 1 new notification
    //xpath =//android.widget.FrameLayout[@content-desc="Sepetim, 1 new notification"]

    // PDP linki
    //(//*[@resource-id='com.dmall.mfandroid:id/ivRecommendationProduct'])[1]

    //dropdown menu
    //com.dmall.mfandroid:id/skuSelectionIcon

    //mor rengi xpath
    //(//*[@resource-id='com.dmall.mfandroid:id/skuNameTV'])[4]

    //seç butonu
    //*[@resource-id='com.dmall.mfandroid:id/continueButton']

    //Sepete ekle butonu
    //*[@resource-id='com.dmall.mfandroid:id/pdpAddToCartButton']
}

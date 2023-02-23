package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> driverSetUp(){


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

    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }

    }
}

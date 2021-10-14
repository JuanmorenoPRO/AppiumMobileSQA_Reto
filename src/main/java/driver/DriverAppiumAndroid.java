package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAppiumAndroid {

    public static AppiumDriver<MobileElement> driver;


    public static DriverAppiumAndroid yourBrowser() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("platformVersion", "11.0");
            capabilities.setCapability("deviceName","emulator-5554");
            capabilities.setCapability("autoGrantPermissions",true);
            capabilities.setCapability("appPackage","io.selendroid.testapp");
            capabilities.setCapability("appActivity",".HomeScreenActivity");
            capabilities.setCapability("noReset","True");

            driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new DriverAppiumAndroid();
    }

    public io.appium.java_client.AppiumDriver<MobileElement> on(){
        return driver;
    }
}

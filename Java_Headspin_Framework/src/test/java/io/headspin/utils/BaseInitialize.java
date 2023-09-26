package io.headspin.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseInitialize {

    public static AppiumDriver driver;

    @BeforeTest(alwaysRun = true)
    public static void BasicInitializer() throws MalformedURLException {
        String appiumURL = "https://dev-au-syd-1.headspin.io:7010/v0/e0fa92946d8140ceaf1b5e47e9863fb5/wd/hub";

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", "00008110-00020CAC118A801E");
        desiredCapabilities.setCapability("automationName","xcuitest");
        desiredCapabilities.setCapability("platformName","ios");
        desiredCapabilities.setCapability("headspin:capture.video",true);
        desiredCapabilities.setCapability("browserName","Safari");
        desiredCapabilities.setCapability("headspin:testName","Appium_session");

        driver = new IOSDriver(new URL(appiumURL),desiredCapabilities);
    }

    @AfterTest(alwaysRun = true)
    public static void tearDown()
    {
        driver.quit();
        System.out.println("App Terminated");
    }
}

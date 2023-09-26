package io.headspin.pages;

import io.headspin.utils.BaseInitialize;
import io.headspin.locators.firstLocator;
import io.headspin.commonFunctinalities.basePage;

import java.time.Duration;

public class firstPage extends BaseInitialize {


    public static void firstMethod() throws InterruptedException {
        System.out.println("App Launched");
        basePage.waitForSpecificTime(10);
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Page Title:" + driver.getTitle());
        basePage.waitForElementAndClick(firstLocator.element1);
        basePage.waitForSpecificTime(10);
        basePage.waitForElementAndSendKeys(firstLocator.element2,"ADMIN");
        basePage.waitForSpecificTime(5);
    }

    public static void secondMethod() throws InterruptedException {
        basePage.waitForSpecificTime(10);
        basePage.waitForElementAndSendKeys(firstLocator.element3,"ADMIN");
        basePage.waitForSpecificTime(5);
    }
}

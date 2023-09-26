package io.headspin.locators;

import io.headspin.utils.BaseInitialize;
import org.openqa.selenium.By;

public class firstLocator extends BaseInitialize {

    public static By element1 = By.xpath("//a[text()='Form Authentication']");
    public static By element2 = By.id("username");
    public static By element3 = By.id("password");

}

package io.headspin.tests;

import io.headspin.utils.BaseInitialize;
import io.headspin.pages.firstPage;
import org.testng.annotations.Test;

public class firstTest extends BaseInitialize {
    @Test(priority = 0)
    public void firstTest() throws InterruptedException {

        firstPage.firstMethod();
        firstPage.secondMethod();
    }


}

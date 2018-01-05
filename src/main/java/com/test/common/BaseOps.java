package com.test.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

/**
 * Created by xxx on 2017/12/31.
 */

@Listeners({org.uncommons.reportng.HTMLReporter.class})
public class BaseOps {
    protected WebDriver driver = WebDriverProvider.getWebDriver();
    protected  WebDriverWait webDriverWait = new WebDriverWait(driver,30);

}


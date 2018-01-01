package com.test.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by xxx on 2018/1/1.
 */

public class WebDriverProvider {
    private static WebDriver driver;
    public static WebDriver getWebDriver() {
        if (driver != null) {
            return driver;
        }
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}

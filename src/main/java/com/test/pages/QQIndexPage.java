package com.test.pages;

import com.test.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xxx on 2018/1/1.
 */

public class QQIndexPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(getClass());

    public QQIndexPage() {
        driver.get("http://www.qq.com/");
    }

    public void goToAssignedPage(String cssLocator){
        logger.info("goTo指定页面，cssLocator：{}",cssLocator);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssLocator))).click();
    }
}

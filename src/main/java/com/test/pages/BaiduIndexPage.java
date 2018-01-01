package com.test.pages;

import com.test.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xxx on 2018/1/1.
 */

public class BaiduIndexPage extends BasePage {
    Logger logger = LoggerFactory.getLogger(getClass());

    public BaiduIndexPage() {
        driver.get("https://www.baidu.com/");
    }

    public void typeInKeywords(String keywords){
        logger.info("输入关键字{}",keywords);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#kw"))).sendKeys(keywords);
    }

    public void clickSearch(){
        logger.info("点击搜索按钮");
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#su"))).click();
    }
}

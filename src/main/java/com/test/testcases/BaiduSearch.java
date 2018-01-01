package com.test.testcases;

import com.test.common.BaseAction;
import com.test.pages.BaiduIndexPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by xxx on 2017/12/31.
 */

public class BaiduSearch extends BaseAction {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DataProvider(name="testData")
    public Object[][] getProductSearchData(){
        return com.test.common.DataProvider.getDataProvider("baidu index");
    }

    @Test(groups = { "demotest"},dataProvider = "testData")
    public void test(String caseId,String caseName,String keyword,String assertType,String locator,String expected){
        this.caseId = caseId;
        this.caseName = caseName;
        BaiduIndexPage baiduIndexPage = new BaiduIndexPage();
        baiduIndexPage.typeInKeywords(keyword);
        baiduIndexPage.clickSearch();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#page > a.n")));
        setCheckPoint(assertType,locator,expected);
        check();
    }
}

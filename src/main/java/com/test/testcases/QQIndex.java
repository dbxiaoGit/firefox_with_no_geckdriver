package com.test.testcases;

import com.test.common.BaseAction;
import com.test.pages.QQIndexPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by xxx on 2018/1/1.
 */


public class QQIndex extends BaseAction {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DataProvider(name="testData")
    public Object[][] getProductSearchData(){
        return com.test.common.DataProvider.getDataProvider("qq");
    }

    @Test(groups = { "demotest"},dataProvider = "testData")
    public void test(String caseId,String caseName,String locator,String assertType,String expected) {
        this.caseId = caseId;
        this.caseName = caseName;
        QQIndexPage qqIndexPage = new QQIndexPage();
        qqIndexPage.goToAssignedPage(locator);
        setCheckPoint(assertType,null,expected);
    }

}

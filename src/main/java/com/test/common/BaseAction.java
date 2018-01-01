package com.test.common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by xxx on 2017/12/31.
 */

public class BaseAction extends BaseOps {
    protected String caseId;
    protected String caseName;
    protected String caseDescription;
    protected List<CheckPoint> checkPoints = new ArrayList<CheckPoint>();

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public List<CheckPoint> getCheckPoints() {
        return checkPoints;
    }

    public void setCheckPoints(List<CheckPoint> checkPoints) {
        this.checkPoints = checkPoints;
    }

    public void setCheckPoint(String actual,String expectation){
        CheckPoint cp = new CheckPoint(caseId,actual,expectation);
        checkPoints.add(cp);
    }

    public void setCheckPoint(String checkType,String locator,String expectation){
        if(checkType.equals("元素个数")){
            int actualNum = driver.findElements(By.cssSelector(locator)).size();
            int expectationNum = Integer.valueOf(expectation);
            CheckPoint cp = new CheckPoint(caseId,actualNum,expectationNum);
            checkPoints.add(cp);
        }
        if(checkType.equals("当前url是否包含指定值")){
            HashSet<String> urlSet = new HashSet<String>();
            for(String handle : driver.getWindowHandles()){
                driver.switchTo().window(handle);
                urlSet.add(driver.getCurrentUrl());
            }
            CheckPoint cp = new CheckPoint(caseId,urlSet.contains(expectation),true);
            checkPoints.add(cp);
        }
    }

    public void check() {
        for (CheckPoint checkPoint : checkPoints) {
            checkPoint.check();   //验证
        }
        checkPoints = new ArrayList<CheckPoint>();//检查完毕后清空
    }
}

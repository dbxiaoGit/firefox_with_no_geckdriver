package com.test.common;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by xxx on 2017/12/31.
 */

public class DataProvider {
    private static final Logger logger = LoggerFactory.getLogger(DataProvider.class);
    private static String excelFileName = "测试数据.xlsx";
    private static Map<String, Object[][]> datas  = new HashMap<String, Object[][]>();;
    private static Map<String, Object[]> headers = new HashMap<String, Object[]>();

    static {
        try {
            parseDataExcel(excelFileName);
            printDatas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void parseDataExcel(String excelFileName) throws Exception {
        //File excelFile = new File(excelFileName);
        //OPCPackage pkg = OPCPackage.open(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(excelFileName);
        int sheetNums = workbook.getNumberOfSheets();
        for (int i = 0; i < sheetNums; i++) {
            XSSFSheet sheet = workbook.getSheetAt(i);

            //第一行第二列被测对象描述
            String testProject = sheet.getRow(0).getCell(1).getStringCellValue().trim();
            logger.info("testProject:{}",testProject);

            int ColumnNum = sheet.getRow(1).getLastCellNum();
            logger.info("headLineLastCellNum:{}",ColumnNum);

            //第二行head部分
            List<String> headList = new ArrayList<String>();
            Row row = sheet.getRow(1);
            for (int j = 0; j < ColumnNum; j++) {
                Cell cell = row.getCell(j);
                String headCellValue = "";
                if (cell!=null) {
                    try {
                        headCellValue = cell.getStringCellValue();
                    } catch (IllegalStateException e) {
                        headCellValue = cell.getNumericCellValue() + "";
                    }
                }
                headList.add(headCellValue);
            }
            Object[] headObjectArray = headList.toArray();
            headers.put(testProject, headObjectArray);

            //当前sheet行数
            int currentSheetRowNum = sheet.getLastRowNum();
            logger.info("currentSheetLastRowNum :{}",currentSheetRowNum + 1);
            List<Object[]> currentSheetDatas = new ArrayList<Object[]>();
            //从第三行开始，测试数据部分
            for (int j = 2; j <= currentSheetRowNum; j++) {
                row = sheet.getRow(j);
                ColumnNum = row.getLastCellNum();
                logger.info("Row {} has {} cells",(j + 1),ColumnNum);

                if (row.getPhysicalNumberOfCells() == 0) {
                    continue;
                }

                List<String> currentRowTestDataCellValues = new ArrayList<String>();
                for (int k = 0; k < ColumnNum; k++) {
                    Cell cell = row.getCell(k);
                    String currentRowCurrentColumnCellValue = "";
                    if (cell != null) {
                        try {
                            currentRowCurrentColumnCellValue = cell.getStringCellValue();
                        } catch (IllegalStateException e) {
                            currentRowCurrentColumnCellValue = cell.getNumericCellValue() + "";
                        }
                    }
                    currentRowTestDataCellValues.add(currentRowCurrentColumnCellValue);
                }
                Object[] currentRowTestDataCellValuesArray = currentRowTestDataCellValues.toArray();

                //如果当前行有非空列的则不过滤掉
                boolean isEmpty = true;
                for (int k = 0; k < currentRowTestDataCellValuesArray.length; k++) {
                    if (!currentRowTestDataCellValuesArray[k].equals("")) {
                        isEmpty = false;
                    }
                }

                if (currentRowTestDataCellValuesArray.length == 0 || isEmpty) {
                    continue;
                }
                currentSheetDatas.add(currentRowTestDataCellValuesArray);
            }

//            Object[][] objDatas = new Object[sheetDatas.size()][];
//            for (int k=0; k<objDatas.length; k++) {
//                objDatas[k] = sheetDatas.get(k);
//            }
//            datas.put(testCaseName, objDatas);
            Object[][] currentSheetDatasArray = new Object[currentSheetDatas.size()][];
            for(int k=0; k<currentSheetDatasArray.length; k++){
                currentSheetDatasArray[k] = currentSheetDatas.get(k);
            }
            datas.put(testProject,currentSheetDatasArray);
        }

    }

    public static void printObjects(Object[][] objs) {
        for (int i=0; i<objs.length; i++) {
            String res = "data: ";
            Object[] objss = objs[i];
            for (int j=0; j<objss.length; j++) {
                if (j == objss.length-1)
                    res += objss[j];
                else
                    res += objss[j] + ", ";
            }
            res.substring(0, res.length()-3);
            logger.info(res);
        }
    }

    public static void printDatas(){
        Iterator<String> testProjectIterator = datas.keySet().iterator();//根据 test case name把excel里的测试数据打印出来
        while(testProjectIterator.hasNext()) {
            String testProject = testProjectIterator.next();
            logger.info("testProject:{}",testProject);
            Object[][] testDatas = datas.get(testProject);
            printObjects(testDatas);
        }
    }

    public static Object[][] getDataProvider(String testProject) {
        return datas.get(testProject);
    }

    public static Object[] getDataProviderHeader(String testProject) {
        return headers.get(testProject);
    }


    public static void main(String[] s){
        //printObjects(datas.get("baidu index"));
    }
}

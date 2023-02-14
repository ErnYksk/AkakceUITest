package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getListData(String path, String sheetName, int columnCnt) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        Sheet sayfa = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sayfa = workbook.getSheet(sheetName);
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        for (int i = 0; i < sayfa.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> satirData = new ArrayList<>();
            for (int j = 0; j < columnCnt; j++) {
                satirData.add(sayfa.getRow(i).getCell(j).toString());
            }

            tablo.add(satirData);
        }

        return tablo;
    }


    public static void writeToExcel(String path, Scenario scenario, String browserName, String time) {

        File f = new File(path);

        if (!f.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Reports");

            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getName());

            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus().toString());

            cell = row.createCell(2);
            cell.setCellValue(browserName);

            cell = row.createCell(3);
            cell.setCellValue(time);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (Exception ex){
                System.out.println("ex = " + ex.getMessage());
            }
        }

        else {
            Sheet sheet=null;
            Workbook workbook=null;
            FileInputStream inputStream=null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            }catch(Exception e)
            {
                System.out.println("e.getMessage() = " + e.getMessage());
            }

        }

    }

}

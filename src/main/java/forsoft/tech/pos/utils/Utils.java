/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.pos.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import static org.apache.poi.ss.usermodel.DateUtil.DAY_MILLISECONDS;
import static org.apache.poi.ss.usermodel.DateUtil.isValidExcelDate;
import static org.apache.poi.ss.usermodel.DateUtil.setCalendar;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author odofintimothy
 */
public class Utils {
    public static Object getData(Row row, String key, Map<String, Integer> map) {
        int cell = 0;
        if (map.containsKey(key)) {
            cell = map.get(key);
            if (row.getCell(cell) == null || row.getCell(cell).getCellType().equals(CellType.BLANK)
                    || row.getCell(cell).getCellType().equals(CellType._NONE)
                    || row.getCell(cell).getCellType().equals(CellType.ERROR)) {
                return "";
            }  else if (row.getCell(cell).getCellType().equals(CellType.BOOLEAN)) {
                return row.getCell(cell).getBooleanCellValue();
            } else if (row.getCell(cell).getCellType().equals(CellType.NUMERIC)) {
                double result =row.getCell(cell).getNumericCellValue();
                if(DateUtil.isValidExcelDate(result)){
                    return getJavaCalendar(result, true, TimeZone.getDefault(), true).getTime();
                }
                return row.getCell(cell).getNumericCellValue();
            } else if (row.getCell(cell).getCellType().equals(CellType.STRING)) {
                return row.getCell(cell).getStringCellValue();
            } 
        } else {
            System.out.println("Key........................." + key + " ..............Not Found");
            return "";
        }

        return "";
    }
    public static Calendar getJavaCalendar(double date, boolean use1904windowing, TimeZone timeZone, boolean roundSeconds) {
  if (!isValidExcelDate(date)) {
    return null;
  }
  int wholeDays = (int)Math.floor(date);
  int millisecondsInDay = (int)((date - wholeDays) * DAY_MILLISECONDS + 0.5);
  Calendar calendar;
  if (timeZone != null) {
    calendar = LocaleUtil.getLocaleCalendar(timeZone);
  } else {
    calendar = LocaleUtil.getLocaleCalendar(); // using default time-zone
  }
  setCalendar(calendar, wholeDays, millisecondsInDay, use1904windowing, roundSeconds);
  return calendar;
}
    public static Workbook getWorkbook(FileInputStream inputStream,
            String excelFilePath) throws IOException {
        Workbook workbook = null;
        
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException(
                    "The specified file is not Excel file");
        }
        
        return workbook;
    }
    
    public static Map<String, Integer> getColumnName(Sheet sheet) {
        Map<String, Integer> maps = new HashMap<>();
        Row row = sheet.getRow(0); //Get first row
        short minColIx = row.getFirstCellNum(); //get the first column index for a row
        short maxColIx = row.getLastCellNum(); //get the last column index for a row
        for (short colIx = minColIx; colIx < maxColIx; colIx++) { //loop from first to last index
            Cell cell = row.getCell(colIx); //get the cell
            maps.put(cell.getStringCellValue().replaceAll("\\s+", "").toUpperCase(), cell.getColumnIndex()); //add the cell contents (name of column) and cell index to the map
            
        }
        
        return maps;
    }
   public static String getCode(Integer result){
       String data="OLW";
       data+=String.format("%04d", result);
       return  data;
   }
}

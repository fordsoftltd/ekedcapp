/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.PageRequest;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JIDEX
 */
public class AppUtil {
    public final static String PASSWORD_UPDATED ="Password Successfully Changed";
    public final static String STRUCT_UPDATED ="Pole Structure Changed";
    public final static String MATERIAL_UPDATED ="Pole Material Changed";
    public final static String IKEJA ="IKEJA BU";
    public final static String RECORD_NOT_CREATED = "Unable To Create Record";
    public final static String RECORD_EMPTY_MESSAGE = "Cannot Save Empty Record";
    public final static String ACTIVE = "Active";
    public final static String INACTIVE = "Not Active";
    public final static String CREATED = "Record Created Successfully";
    public final static String UPDATED = "Record Updated Successfully";
    public final static String PASSPORTCHANGED = "Photograph Update Completed";
    public final static String PASSWORD_CHANGED = "Password Update Completed";
    public final static String PASSWORD_NOT_MATCH = "Credential Supply does not match existing one";
    public final static String ACCOUNT_ALREADY_EXISTS = "User with specified email/username already exists";
    public final static String DOCUMENTUPLOADED = "File Successfully Attached";
    public final static String NOT_FOUND = "Error: Record Not Found"; 
    public final static String SUCCESS = "Success";
    public final static String ERROR = "Error";
    public final static String ADMIN_SESSION = "admin";
    public final static String LECTURER_SESSION = "holder";
     public final static String USER_SESSION = "user";
    public final static String STUDENT_SESSION = "students";
    public final static Severity SUCCESS_TAG = FacesMessage.SEVERITY_INFO;
    public final static Severity ERROR_TAG = FacesMessage.SEVERITY_ERROR;
    public final static Severity WARNING_TAG = FacesMessage.SEVERITY_WARN;
    public final static Severity FATAL_TAG = FacesMessage.SEVERITY_FATAL;
    public final static String SERVER_ERROR = "An Error Occur Please Contact Administrator";
    public final static String DELETE_MESSAGE = "Record Deleted Successfully";
    public final static String DATA_IMPORT_MESSAGE = "Record Successfully Imported";
    public final static Boolean ACTIVE_VALUE = true;
    public final static String TASK_HEADER_NEW = "Add New Assignment";
    public final static String TASK_HEADER_EDIT = "Edit Existing Assignment";
    public final static String ACTION_NEW = "Save";
    public final static String ACTION_EDIT = "Update";
    public final static String ACTION_EDIT_ICON = "ui-icon-update";
    public final static String ACTION_NEW_ICON = "fa fa-plus";
    public final static String DATA_TRANSFORMER = "Transformer";
    public final static String DATA_DISCO = "Disco";
    public final static String DATA_BUSINESS = "Business";
    public final static String DATA_FEEDER = "Feeder";
    public final static String ACCOUNT_NOT_FOUND = "Account with specify credential does not exists";
    public final static String PROCESSING_CODE = "Processing QRCode......";
    public final static String GENERATING_CODE = "Generating QRCode......";
     public final static String CODE_COMPLETE = "QRCODE Successfully Generated.";
      public final static String EMPTY_CODE_DATA = "Cannot Generate QRCODE. Please Select Record From Table";
      public final static String EMPTY_CODE_DATA_2 = "Cannot Generate QRCODE. Record Not Found";
    public final static String PLEASE_WAIT = "Please Wait";
    public final static String INVALID_POLE = "Error: Verification Not Successfull! No Match Found for the specified Pole No";
    public final static String INVALID_CUSTOMER= "Error: Verification Not Successfull! No Match Found for the specified Customer";
    public final static String INVALID_CIN = "Error: Verification Not Successfull! No Match Found for the specified CIN"; 
    
    
    private static Workbook getWorkbook(FileInputStream inputStream,
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
     public static PageRequest getPage(Integer page, Integer size) {
        PageRequest request = PageRequest.of(page, size);
        return request;
    }
    public static String getDate(Date d){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return ft.format(d);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.components;

import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.CustomerMeta;
import forsoft.tech.app.service.AppService;
import forsoft.tech.pos.utils.BuildingUtils;
import forsoft.tech.pos.utils.CustomerUtils;
import forsoft.tech.pos.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author odofintimothy
 */
@Component
public class CustomerManager {
    @Autowired
    AppService service;
    public void save(File f){
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Workbook workbook = Utils.getWorkbook(inputStream, f.getAbsolutePath());
            Sheet firstSheet = workbook.getSheetAt(0);
            Map<String, Integer> map = Utils.getColumnName(firstSheet);
            Iterator<Row> iterator = firstSheet.iterator();
            iterator.next();
            int totalRow = firstSheet.getLastRowNum();
            
            while (iterator.hasNext()) {
                //counter++;
                Row row = iterator.next();
              saveBuilding(row, map);
             
                
            }
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void saveCustomer(File f){
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Workbook workbook = Utils.getWorkbook(inputStream, f.getAbsolutePath());
            Sheet firstSheet = workbook.getSheetAt(0);
            Map<String, Integer> map = Utils.getColumnName(firstSheet);
            Iterator<Row> iterator = firstSheet.iterator();
            iterator.next();
            int totalRow = firstSheet.getLastRowNum();
            
            while (iterator.hasNext()) {
                //counter++;
                Row row = iterator.next();
              saveBuilding(row, map);
             
                
            }
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void saveBuilding(Row row, Map<String, Integer> map ){
         Building rs = new Building();
                rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
                rs.setAncillaryrole(Utils.getData(row, BuildingUtils.ANCILLARYROLE, map) + "");
                rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
                rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
                rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
                rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
                
                List<Building> b = service.getBuildingRepo().findByBldcodefinal(rs.getBldcodefinal());
                if(!b.isEmpty()){
                   Building db = b.get(0);
                   rs.setId(db.getId());
                }
               service.getBuildingRepo().save(rs); 
    }
    
     void saveCustomer(Row row, Map<String, Integer> map ){
         CustomerMeta rs = new CustomerMeta();
                rs.setApproximatetotalratingofac(Utils.getData(row, CustomerUtils.APPROXIMATETOTALRATINGOFAC, map) + "");
               
                
                List<Building> b = service.getBuildingRepo().findByBldcodefinal(rs.getBldcodefinal());
                if(!b.isEmpty()){
                   Building db = b.get(0);
                   rs.setId(db.getId());
                }
               service.getCustomerMetaRepo().save(rs); 
    }
}

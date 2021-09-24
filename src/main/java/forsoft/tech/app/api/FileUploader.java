/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.api;

import forsoft.tech.app.components.CustomerManager;
import forsoft.tech.app.utils.Utils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletContext;
import org.apache.commons.io.FileUtils;
import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author odofintimothy
 */
@RestController
@RequestMapping(value="/uploads",headers = "Accept=application/json")
public class FileUploader {
    @Autowired
    CustomerManager customerManager;
    
    @Autowired
    ServletContext context;
    
    @PostMapping("/file")
    @ApiOperation(value = "Make a POST request to upload the file",
            produces = "application/json", consumes = org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE)
    public DeferredResult<ResponseEntity> uploadFile(
            @RequestParam(value = "category", required = true) String category,
            @RequestPart(value = "file", required = true) MultipartFile file) {
        DeferredResult<ResponseEntity> result = new DeferredResult<>();
            try {
                String originalName = file.getOriginalFilename().replaceAll("[\\\\/><\\|\\s\"'{}()\\[\\]]+", "_");
                String files = getBasePath() + File.separator + Utils.getNewFileName(getBasePath(), originalName);

                File testFile = new File(files);
                FileUtils.writeByteArrayToFile(testFile, file.getBytes());
                if(category.equals("BUILDING")){
                    customerManager.save(testFile);
                }else{
                    customerManager.saveCustomer(testFile);
                }
                result.setResult(ResponseEntity.ok("Upload in progress"));
                return result;

            } catch (IOException e) {

                e.printStackTrace();
                result.setResult(new ResponseEntity("An error occur while uploading", HttpStatus.OK));
                return result;

            }
        } 

    
 String getBasePath() {
        return context.getRealPath("/WEB-INF/documents");
    }
}

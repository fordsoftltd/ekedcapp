/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.service;

import forsoft.tech.app.repo.BuildingRepo;
import forsoft.tech.app.repo.CustomerMetaRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author odofintimothy
 */
@Service
@Data
public class AppService {
   @Autowired
   CustomerMetaRepo  customerMetaRepo;
   @Autowired
   BuildingRepo buildingRepo;
}

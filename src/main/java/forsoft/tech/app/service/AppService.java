/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.service;

import forsoft.tech.app.repo.*;
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
    BuildingRepo buildingRepo;
    @Autowired
    CustomerbkRepo customerbkRepo;
    @Autowired
    TaskschedulesRepo taskschedulesRepo;
    @Autowired
    CustomerBustypeRepo customerBustypeRepo;
    @Autowired
    CustomerHouseRepo customerHouseRepo;
    @Autowired
    CustomerTariffRepo customerTariffRepo;

    @Autowired
    CustomerviewrawRepo customerviewrawRepo;
    @Autowired
    HtpolesviewrawRepo htpolesviewrawRepo;
    @Autowired
    LtpolesviewrawRepo ltpolesviewrawRepo;
    @Autowired
    LtpolescontractorRepo ltpolescontractorRepo;
    @Autowired
    CustomercontractorRepo customercontractorRepo;
    @Autowired
    HtpolescontractorRepo htpolescontractorRepo;
    @Autowired
    AdminRepo adminRepo;

    @Autowired
    CustomerviewRepo customerviewRepo;

    @Autowired
    ApplogRepo applogRepo;
    @Autowired
    PolesviewRepo polesviewRepo;
    @Autowired
    StaffRepo staffRepo;
    @Autowired
    StateRepo stateRepo;
    @Autowired
    StatelgaRepo statelgaRepo;
    @Autowired
    UserrolesRepo userrolesRepo;
    @Autowired
    UsersRepo usersRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    PolesRepo polesRepo;

    @Autowired
    PoleshistoryRepo poleshistoryRepo;

    @Autowired
    CustomerhistoryRepo customerhistoryRepo;
    @Autowired
    FeederRepo feederRepo;
    @Autowired
    DistrictRepo districtRepo;
    @Autowired
    LtpolesviewRepo ltpolesviewRepo;
    @Autowired
    LtpolesRepo ltpolesRepo;
    @Autowired
    LtpoleshistoryRepo ltpoleshistoryRepo;
}

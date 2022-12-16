/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Building;

import java.util.Date;
import java.util.List;

import forsoft.tech.app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author odofintimothy
 */
public interface BuildingRepo extends JpaRepository<Building,Long> {

    @Modifying
    @Transactional
    @Query("update  Building st set st.donedate=:pasteddate, st.done=:isDone, st.doneby=:pastedBy where st.building_code_updated=:buildingcode")
    void updateBuilding(@Param("pasteddate") Date pasteddate, @Param("isDone")Boolean done,
                        @Param("pastedBy") Integer user,
                        @Param("buildingcode")String buildingcode);
    @Query(value="select * from building where building_code_updated=:bldcodefinal",nativeQuery=true)
    List<Building> findByBldcodefinal(@Param("bldcodefinal")String code);
}

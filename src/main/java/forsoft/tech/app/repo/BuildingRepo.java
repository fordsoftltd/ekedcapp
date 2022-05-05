/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Building;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author odofintimothy
 */
public interface BuildingRepo extends JpaRepository<Building,Long> {
    @Query(value="select * from building where building_code_updated=:bldcodefinal",nativeQuery=true)
    List<Building> findByBldcodefinal(@Param("bldcodefinal")String code);
}

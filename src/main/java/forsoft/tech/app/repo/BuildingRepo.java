/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Building;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author odofintimothy
 */
public interface BuildingRepo extends JpaRepository<Building,Long> {
    
    List<Building> findByBldcodefinal(String code);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface DistrictRepo extends JpaRepository<District,Integer> {
    @Query("select st from District st where st.description=?1")
    List<District> findBydescription(String description);
    @Query("select st from District st where st.contractorid=?1")
    List<District> listByContractor(String description);
     
}
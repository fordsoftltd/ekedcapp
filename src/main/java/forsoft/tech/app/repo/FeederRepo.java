/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Feeder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface FeederRepo extends JpaRepository<Feeder,Integer> {
     @Query("select st from Feeder st where st.description=?1")
    List<Feeder> findBydescription(String description);
     @Query("select st from Feeder st where st.businessunitid.id=?1")
    List<Feeder> findByBusinessunit(Integer id);
    @Query("select st from Feeder st where st.businessunitid.description=?1")
    List<Feeder> findByDistrict(String description);
}

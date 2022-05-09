/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;


import forsoft.tech.app.model.Admin;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface AdminRepo extends JpaRepository<Admin,Integer>{
    @Query("select st from Admin st where st.username=?1 or st.contractorid=?2")
    List<KafkaProperties.Admin> isRecordExists(String username, String contractorid);
    @Query("select st from Admin st where st.username=?1")
    List<Admin> findByUsername(String username);
    
}

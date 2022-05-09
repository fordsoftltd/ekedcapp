/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Ltpolesview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface LtpolesviewRepo extends JpaRepository<Ltpolesview,Integer> {
  List<Ltpolesview> findByUsername(String username);
    @Query("select st from Ltpolesview st where st.contractorid=?1")
    List<Ltpolesview> findByContractor(String contractorid);
     @Query(value="select * from ltpolesview  where contractorid=:contractorid and DATE(datepasted)=:datepasted", nativeQuery=true)
    List<Ltpolesview> findByContractor(@Param("contractorid")String contractorid, 
            @Param("datepasted")String datepasted);
}

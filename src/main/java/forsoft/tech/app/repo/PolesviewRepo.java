/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Polesview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface PolesviewRepo extends JpaRepository<Polesview,Integer>{
     List<Polesview> findByUsername(String username);
    @Query("select st from Polesview st where st.contractorid=:contractorid")
    List<Polesview> findByContractor(@Param("contractorid")String contractorid);
    
    @Query(value="select * from polesview  where contractorid=:contractorid and DATE(datepasted)=:datepasted", nativeQuery=true)
    List<Polesview> findByContractor(@Param("contractorid")String contractorid, @Param("datepasted")String datepasted);
   
}

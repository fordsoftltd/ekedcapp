/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Customerview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface CustomerviewRepo extends JpaRepository<Customerview,Integer> {
     @Query("select st from Customerview st where st.username=?1 order by DATE(datepasted) desc")
    List<Customerview> findByUsername(String username);
    @Query("select st from Customerview st where st.contractorid=?1 order by DATE(datepasted) desc")
    List<Customerview> findByContractor(String contractorid);
     @Query("select st from Customerview st where st.contractorid=:contractorid"
             + " and DATE(st.datepasted) =:reportdate")
    List<Customerview> findByContractor(@Param("contractorid")String contractorid,
            @Param("reportdate")Date reportdate);
    
    @Query(value="select * from customerview  where contractorid=:contractorid"
             + " and DATE(datepasted) =:reportdate", nativeQuery=true)
    List<Customerview> findByContractor(@Param("contractorid")String contractorid,
            @Param("reportdate")String reportdate);
}

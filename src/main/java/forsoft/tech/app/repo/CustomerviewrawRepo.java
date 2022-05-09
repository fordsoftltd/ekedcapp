/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Customerviewraw;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface CustomerviewrawRepo extends JpaRepository<Customerviewraw, Integer> {

    @Query("select st from Customerviewraw st where DATE(st.datepasted)=:datepasted")
    List<Customerviewraw> findByDate(@Param("datepasted")Date d);
    
 @Query("select st from Customerviewraw st where st.contractorid=:contractorid"
            + "")
    Page<Customerviewraw> findByContractor(@Param("contractorid") String contractorid, final Pageable p);
  
    @Query(value="select * from customerviewraw  where contractorid=:contractorid"
            + " and DATE(datepasted) =:reportdate", nativeQuery = true)
    List<Customerviewraw> findByContractor(@Param("contractorid") String contractorid,
            @Param("reportdate") String reportdate);

    @Query("select st from Customerviewraw st where DATE(st.datepasted)=:reportdate and st.userid=:userid")
    List<Customerviewraw> findByDateAndUserdesktop(@Param("reportdate") Date reportdate, @Param("userid") Integer userid);

    @Query("select st from Customerviewraw st where DATE(st.datepasted)=?1 and st.userid=?2")
    List<Customerviewraw> findByDateAndUser(Date d, Integer userid);

    @Query("select st from Customerviewraw st where st.userid=?1")
    List<Customerviewraw> findByUser(Integer userid);
     @Query("select st from Customerviewraw st where st.username=?1")
    List<Customerviewraw> findByUser(String userid);
    
    @Query(value="select * from customerviewraw  where DATE(datepasted)=:requestdata and username=:userid", nativeQuery=true)
    List<Customerviewraw> findByUser(@Param("requestdata")String requestdata, 
            @Param("userid")String userid);
}

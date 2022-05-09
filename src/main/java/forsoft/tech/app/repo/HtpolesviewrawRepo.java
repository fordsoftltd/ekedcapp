/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Htpolesviewraw;
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
public interface HtpolesviewrawRepo extends JpaRepository<Htpolesviewraw, Integer> {

    @Query("select st from Htpolesviewraw st where st.datepasted=?1")
    List<Htpolesviewraw> findByDate(Date d);

    @Query("select st from Htpolesviewraw st where st.datepasted=?1 and st.userid=?2")
    List<Htpolesviewraw> findByDateAndUser(Date d, Integer userid);
    
    @Query(value="select * from htpolesviewraw where DATE(datepasted)=:requestdata and username=:userid",nativeQuery = true)
    List<Htpolesviewraw> findByUser(@Param("requestdata")String requestdata,
            @Param("userid")String userid);
    
    @Query("select st from Htpolesviewraw st where st.userid=?1")
    List<Htpolesviewraw> findByUser(Integer userid);
    
    @Query("select st from Htpolesviewraw st where st.username=?1")
    List<Htpolesviewraw> findByUser(String userid);
    
    @Query("select st from Htpolesviewraw st where st.contractorid=:contractorid")
    Page<Htpolesviewraw> listByContractor(@Param("contractorid") String contractorid, Pageable page);
    
    @Query(value="select * from htpolesviewraw  where contractorid=:contractorid and DATE(datepasted)=:datepasted", nativeQuery=true)
    List<Htpolesviewraw> listByContractor(@Param("contractorid") String contractorid,
            @Param("datepasted")String datepasted);
    
     @Query(value="select * from htpolesviewraw  where contractorid=:contractorid"
            + " and DATE(datepasted) =:reportdate", nativeQuery = true)
    List<Htpolesviewraw> findByContractor(@Param("contractorid") String contractorid,
            @Param("reportdate") String reportdate);
}

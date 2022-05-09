/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Ltpolesviewraw;
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
public interface LtpolesviewrawRepo extends JpaRepository<Ltpolesviewraw, Integer> {

    @Query("select st from Ltpolesviewraw st where DATE(st.datepasted)=?1")
    List<Ltpolesviewraw> findByDate(Date d);

    @Query("select st from Ltpolesviewraw st where st.contractorid=:contractorid")
    Page<Ltpolesviewraw> listByContractor(@Param("contractorid")String contractorid, Pageable page);
    
    @Query(value="select * from ltpolesviewraw  where contractorid=:contractorid and DATE(datepasted)=:datepasted", nativeQuery=true)
    List<Ltpolesviewraw> listByContractor(@Param("contractorid")String contractorid, 
            @Param("datepasted")String datepasted);
    
    @Query(value="select st from Ltpolesviewraw st where DATE(st.datepasted)=:requestdata and st.userid=:userid", nativeQuery = true)
    List<Ltpolesviewraw> findByDateAndUser(@Param("requestdata")Date requestdata, @Param("userid")Integer userid);
    
    @Query(value="select * from ltpolesviewraw  where DATE(datepasted)=:requestdata and username=:userid", nativeQuery=true)
    List<Ltpolesviewraw> findByUser(@Param("requestdata")String requestdata,
            @Param("userid")String userid);
     
    @Query("select st from Ltpolesviewraw st where st.userid=?1")
    List<Ltpolesviewraw> findByUser(Integer userid);
    @Query("select st from Ltpolesviewraw st where st.username=?1")
    List<Ltpolesviewraw> findByUser(String userid);
    
    @Query(value="select * from ltpolesviewraw  where contractorid=:contractorid"
            + " and DATE(datepasted) =:reportdate", nativeQuery = true)
    List<Ltpolesviewraw> findByContractor(@Param("contractorid") String contractorid,
            @Param("reportdate") String reportdate);

}

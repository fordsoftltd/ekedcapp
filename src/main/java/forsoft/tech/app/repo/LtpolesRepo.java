/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Ltpoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface LtpolesRepo extends JpaRepository<Ltpoles,Integer>{
    @Query("select count(st) from Ltpoles st where st.done=?1")
    BigInteger getDone(Boolean done);
    
     @Query("select count(st) from Ltpoles st where st.done=?1 and st.contractorid=?2")
    BigInteger getDone(Boolean done,String contractor);
     @Query("select count(st) from Ltpoles st where st.contractorid=:contractor")
    Long getCount(@Param("contractor")String contractor);
    
    
    @Query("select st from Ltpoles st where st.ltsupportstructureno=?1")
    List<Ltpoles> findByLtPoleno(String poleno);

    @Query("select st from Ltpoles st where st.id between ?1 and ?2 and (st.connectednetwork=?3 or st.connectednetwork=?4)")
    List<Ltpoles> findByRange(int page, int size, String v1, String v2);

    @Query("select st from Ltpoles st where st.feederid=?1 order by st.ltsupportstructureno")
    List<Ltpoles> filterHtpole(String fedName);
    
    @Query("select st from Ltpoles st where st.feederid=?1 order by st.ltsupportstructureno")
    List<Ltpoles> filterLtpole(String fedName);
    
    @Query("select st from Ltpoles st where st.feederid=?1 and st.contractorid=?2 order by st.ltsupportstructureno")
    List<Ltpoles> filterLtpole(String fedName,String contractorid);
    
    @Query("select st from Ltpoles st where st.feederid=?1 and st.done=?2 order by st.ltsupportstructureno")
    List<Ltpoles> filterLtpole(String fedName,Boolean status);
    
    @Query("select st from Ltpoles st where st.feederid=?1 and st.done=?2 and st.contractorid=?3 order by st.ltsupportstructureno")
    List<Ltpoles> filterLtpole(String fedName,Boolean status, String contractorid);
    
    @Modifying
    @Transactional
    @Query("delete from Ltpoles st where st.feederid =?1 and st.contractorid=?2")
    void deleteByFeederName(String fedName,String contractorid);
    
    @Modifying
    @Transactional
    @Query("delete from Ltpoles st where st.feederid =?1")
    void deleteByFeederName(String fedName);
    
    @Query("select st from Ltpoles st where st.id in :id order by st.htsupportstructureno ")
    List<Ltpoles> findById(@Param("id") List<Integer> id);
    
    @Query("select st from Ltpoles st where st.id in :id order by st.ltsupportstructureno ")
    List<Ltpoles> findByLtId(@Param("id") List<Integer> id);
    
    @Query("select st from Ltpoles st where st.done=?1 order by st.htsupportstructureno ")
    List<Ltpoles> findByDone(Boolean done);
    
//    @Query("select count(st) from Ltpoles st where st.done=?1")
//    Integer getDone(Boolean done);
    
    @Query("select st from Ltpoles st where st.done=?1 order by st.ltsupportstructureno ")
    List<Ltpoles> findByLtDone(Boolean done);
    
   
    @Query("select st from Ltpoles st where st.connectednetwork=?1 or st.connectednetwork=?2")
    List<Ltpoles> listData(String m1, String m2); 
    @Query("select  DISTINCT(st.transformer) from Ltpoles st where st.feederid=?1")
    List<String> findTransformerList(String feeder); 
    @Query("select  DISTINCT(st.cableupriserid) from Ltpoles st where st.transformer=?1")
    List<String> findCableupriseridList(String transformer);
    
    
    @Query("select  st from Ltpoles st where st.feederid=?1 and st.transformer=?2 and st.cableupriserid=?3")
    List<Ltpoles> queryForprint(String feeder, String transformer, String upriserid);
    
    @Query("select  st from Ltpoles st where st.feederid=?1 and st.transformer=?2 order by st.ltsupportstructureno")
    List<Ltpoles> queryForprint(String feeder, String transformer);
    
    @Query("select  DISTINCT(st.poletype) from Ltpoles st")
    List<String> fetchPoletypes();
    @Query("select  DISTINCT(st.cableupriserid) from Ltpoles st")
    List<String> fetchPolecableupriser();
    
}

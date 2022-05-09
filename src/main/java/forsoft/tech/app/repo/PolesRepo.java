/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;
;
import forsoft.tech.app.model.Poles;
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
public interface PolesRepo extends JpaRepository<Poles, Integer> {

    @Query("select count(st) from Poles st where st.done=?1")
    BigInteger getDone(Boolean done);

    @Query("select count(st) from Poles st where st.done=?1 and st.contractorid=?2")
    BigInteger getDone(Boolean done, String contractorid);

    @Query("select count(st) from Poles st where st.contractorid=?1")
    Long getCount(String contractor);

    @Query("select st from Poles st where st.htsupportstructureno=?1")
    List<Poles> findByHtPoleno(String poleno);

    @Query("select st from Poles st where st.ltsupportstructureno=?1")
    List<Poles> findByLtPoleno(String poleno);

    @Query("select st from Poles st where st.id between ?1 and ?2 and (st.connectednetwork=?3 or st.connectednetwork=?4)")
    List<Poles> findByRange(int page, int size, String v1, String v2);

    @Query("select st from Poles st where st.feederid=?1 order by st.htsupportstructureno")
    List<Poles> filterHtpole(String fedName);
    
    @Query("select st from Poles st where st.feederid=?1 and st.contractorid=?2 order by st.htsupportstructureno")
    List<Poles> filterHtpole(String fedName, String contractorid);

    @Query("select st from Poles st where st.feederid=?1 and st.done=?2 order by st.htsupportstructureno")
    List<Poles> filterHtpole(String fedName, Boolean status);

    @Query("select st from Poles st where st.feederid=?1 and st.done=?2 and st.contractorid=?3 order by st.htsupportstructureno")
    List<Poles> filterHtpole(String fedName, Boolean status, String contractorid);

    @Query("select st from Poles st where st.feederid=?1 order by st.ltsupportstructureno")
    List<Poles> filterLtpole(String fedName);

    @Modifying
    @Transactional
    @Query("delete from Poles st where st.feederid =?1 and st.contractorid=?2")
    void deleteByFeederName(String fedName, String contractorid);

    @Modifying
    @Transactional
    @Query("delete from Poles st where st.feederid =?1")
    void deleteByFeederName(String fedName);

    @Query("select st from Poles st where st.id in :id order by st.htsupportstructureno ")
    List<Poles> findById(@Param("id") List<Integer> id);

    @Query("select st from Poles st where st.id in :id order by st.ltsupportstructureno ")
    List<Poles> findByLtId(@Param("id") List<Integer> id);

    @Query("select st from Poles st where st.done=?1 order by st.htsupportstructureno ")
    List<Poles> findByDone(Boolean done);

//    @Query("select count(st) from Poles st where st.done=?1")
//    Integer getDone(Boolean done);
    @Query("select st from Poles st where st.done=?1 order by st.ltsupportstructureno ")
    List<Poles> findByLtDone(Boolean done);

    @Query("select st from Poles st where st.connectednetwork=?1 or st.connectednetwork=?2")
    List<Poles> listData(String m1, String m2);

    @Query("select  DISTINCT(st.transformer) from Poles st where st.feederid=?1")
    List<String> findTransformerList(String feeder);

    @Query("select  DISTINCT(st.cableupriserid) from Poles st where st.transformer=?1")
    List<String> findCableupriseridList(String transformer);

    @Query("select  st from Poles st where st.feederid=?1 and st.transformer=?2 and st.cableupriserid=?3")
    List<Poles> queryForprint(String feeder, String transformer, String upriserid);

    @Query("select  st from Poles st where st.feederid=?1 and st.transformer=?2 order by st.ltsupportstructureno")
    List<Poles> queryForprint(String feeder, String transformer);

    @Query("select  DISTINCT(st.poletype) from Poles st")
    List<String> fetchPoletypes();
}

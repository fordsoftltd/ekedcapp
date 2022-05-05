/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Customer;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JIDEX
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

     @Query(value="select * from customer where bldcodefinalupdated=:bldcodefinal",nativeQuery=true)
     List<Customer> findByBldcodefinal(@Param("bldcodefinal")String code);
    @Query(value="SELECT COUNT(*) FROM customer   where contractorid=:contractorid and YEAR(date_uploaded)=:yearUploaded", nativeQuery=true)
    Long getTotalRecord(@Param("contractorid")String contractorid, @Param("yearUploaded")Integer year);

    @Modifying
    @Transactional
    @Query("delete from Customer st where st.id in :id")
    void deleteData(@Param("id") Integer id);

    @Query(value="select * from customer  where cin=?1 order by id desc limit 1", nativeQuery = true)
    List<Customer> findByCin(String cin);
    
    @Query(value="select * from customer  where customeraccountno=?1 order by id desc limit 1", nativeQuery = true)
    List<Customer> findByAccountNumber(String cin);
    @Query("select st from Customer st where st.cin=?1 and st.customeraccountno=?2 order by st.cin")
    List<Customer> findByCin(String cin, String account);
    @Query("select st from Customer st where st.customeraccountno=?1 and st.cin=?2 order by st.id desc")
    List<Customer> findByAccountnumber(String customeraccountno, String cin);

    @Query(value="select * from customer  where YEAR(date_uploaded)=:reportYear  order by cin limit :page,:size", nativeQuery=true)
    List<Customer> findByRange(@Param("page")int page,@Param("size")int size, @Param("reportYear")int year);

    @Query(value="select * from customer  where YEAR(date_uploaded)=?4 and feedername=?1 and feedername=?2 and feedername=?3",nativeQuery=true)
    List<Customer> filter(String buName, String fedName, String dssName,int year);

    @Query(value="select * from customer where YEAR(date_uploaded)=?2 and feedername=?1 order by cin",nativeQuery=true)
    List<Customer> filterByFeeder(String fedName,int year);
    
    @Query(value="select * from customer where YEAR(date_uploaded)=?3 and feedername=?1 and contractorid=?2 order by cin",nativeQuery=true)
    List<Customer> filterByFeeder(String fedName, String contractor,int year);
    
    
    @Query("select st from Customer st where  st.contractorid=?1")
    List<Customer> filterByContractor(String contractor);
    
    
    @Query(value="select * from customer  where YEAR(date_uploaded)=?3 and feedername=?1 and done=?2 order by cin",nativeQuery=true)
    List<Customer> listDone(String fedName, Boolean status,int year);
    
    @Query(value="select * from customer  where YEAR(date_uploaded)=?4 and feedername=?1 and done=?2  and contractorid=?3 order by cin",nativeQuery=true)
    List<Customer> listDone(String fedName, Boolean status,String contractorid,int year);

    @Modifying
    @Transactional
    @Query("delete from Customer st where st.feedername =?1 and st.contractorid=?2")
    void deleteByFeederName(String fedName,String contractorid);
    @Modifying
    @Transactional
    @Query("delete from Customer st where st.feedername =?1")
    void deleteByFeederName(String fedName);

    @Query("select st from Customer st where st.id in :id order by st.cin")
    List<Customer> findById(@Param("id") List<Integer> id);

    @Query("select st from Customer st where st.done=?1 order by st.cin")
    List<Customer> findByDone(Boolean done);

    @Query("select count(st) from Customer st where st.done=?1")
    BigInteger getDone(Boolean done);
    
    @Query("select count(st) from Customer st where st.done=?1 and st.contractorid=?2")
    BigInteger getDone(Boolean done, String contractor);
    @Query("select count(st) from Customer st where st.contractorid=?1")
    Long getCount(String contractor);
    

    @Query(value="select  DISTINCT(transformername) from customer where YEAR(date_uploaded)=?2 and feedername=?1",nativeQuery=true)
    List<String> findTransformerList(String feeder,int year);

    @Query(value="select  DISTINCT(cableupriserid) from customer where YEAR(date_uploaded)=?2 and transformername=?1",nativeQuery=true)
    List<String> findCableupriseridList(String transformer,int year);

    @Query(value="select  * from customer  where YEAR(date_uploaded)=?4 and feedername=?1 and transformername=?2 and cableupriserid=?3 order by cin",nativeQuery=true)
    List<Customer> queryForprint(String feeder, String transformer, String upriserid,int year);

    @Query(value="select  DISTINCT(tariff) from customer where YEAR(date_uploaded)=?1",nativeQuery=true)
    List<String> getTarifList(int year);

    @Query(value="select  DISTINCT(natureofuseelectricity) from customer where YEAR(date_uploaded)=?1",nativeQuery=true)
    List<String> getTypeofBusinesList(int year);

    @Query(value="select  DISTINCT(premisestype) from customer where YEAR(date_uploaded)=?1",nativeQuery=true)
    List<String> getHouseList(int year);

    @Query("select  st.cin from Customer st")
    List<String> getUpriserlist();
    
    @Query(value="select * from customer  where YEAR(date_uploaded)=?3 and feedername=?1 and transformername=?2 order by cin",nativeQuery=true)
    List<Customer> queryForprint(String feeder, String transformer,int year);
    
    @Modifying
    @Transactional
    @Query(value="DELETE t1 FROM customer t1\n" +
" INNER JOIN customer t2 \n" +
" WHERE \n" +
"     t1.id < t2.id AND \n" +
"     t1.cin = t2.cin", nativeQuery = true)
    void removeDuplicates();
}

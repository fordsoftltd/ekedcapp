/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Customerhistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface CustomerhistoryRepo extends JpaRepository<Customerhistory,Integer>{
    @Query(value="select * from customerhistory st where parent=?1 limit 4", nativeQuery = true)
    List<Customerhistory> findByParentid(Integer parentid);
    @Query("select st from Customerhistory st where st.cin=?1")
    List<Customerhistory> findByCin(String cin);
    @Query(value="select * from customerhistory  where customeraccountno=?1 order by id desc limit 1", nativeQuery = true)
    List<Customerhistory> findByAccountNumber(String cin);
    
}

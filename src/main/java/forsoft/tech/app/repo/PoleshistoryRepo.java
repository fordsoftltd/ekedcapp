/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Poleshistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface PoleshistoryRepo extends JpaRepository<Poleshistory,Integer>{
    @Query("select st from Poleshistory st where st.parent.id=?1 order by st.htsupportstructureno")
    List<Poleshistory> findByParentid(Integer parentid);
    @Query("select st from Poleshistory st where st.htsupportstructureno=?1 or st.htsupportstructureno=?1 order by st.htsupportstructureno")
    List<Poleshistory> findByHtpoleNo(String poleno);
    
   
}

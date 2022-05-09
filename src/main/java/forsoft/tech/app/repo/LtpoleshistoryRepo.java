/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Ltpoleshistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface LtpoleshistoryRepo extends JpaRepository<Ltpoleshistory,Integer>{
     @Query("select st from Ltpoleshistory st where st.parent.id=?1 order by st.ltsupportstructureno")
    List<Ltpoleshistory> findByParentid(Integer parentid);
    @Query("select st from Ltpoleshistory st where st.ltsupportstructureno=?1  order by st.ltsupportstructureno")
    List<Ltpoleshistory> findByHtpoleNo(String poleno);
}

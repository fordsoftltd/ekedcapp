/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface UsersRepo extends JpaRepository<Users,Integer>{
@Query("select st from Users st where st.email=?1 or st.username=?2")
List<Users> findByEmailandUsername(String email, String username);
@Query("select st from Users st where st.password=?1 or st.username=?2")
List<Users> findByUsernameAndPassword(String password, String username);

@Query("select st from Users st where st.email=?1")
List<Users> findByEmail(String email);
@Query("select st from Users st where st.username=?1")
List<Users> findByUsername(String username);

@Query("select st from Users st where st.contractorid=?1 order by st.id desc")
List<Users> findByContractor(String contractorid);


}

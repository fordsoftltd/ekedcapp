/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Customerbk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface CustomerbkRepo extends JpaRepository<Customerbk,Integer>{
    @Query("select st from Customerbk st where  st.contractorid=?1")
    List<Customerbk> filterByContractor(String contractor);
}

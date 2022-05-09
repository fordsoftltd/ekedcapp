/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Statelga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface StatelgaRepo extends JpaRepository<Statelga,Integer>{
  @Query("select st from Statelga st where st.state.stateId=?1")
  List<Statelga> findBystateid(Integer stateId);
    
}

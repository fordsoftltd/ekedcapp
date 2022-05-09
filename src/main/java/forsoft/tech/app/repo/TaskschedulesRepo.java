/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Taskschedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public interface TaskschedulesRepo extends JpaRepository<Taskschedules,Long>{
    @Query("select st from Taskschedules st order by st.id desc")
    List<Taskschedules> list();
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.CustomerMeta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author odofintimothy
 */
public interface CustomerMetaRepo extends JpaRepository<CustomerMeta,Long>{
     List<CustomerMeta> findByBldcodefinal(String code);
}

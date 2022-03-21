/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.repo;

import forsoft.tech.app.model.CustomerMeta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author odofintimothy
 */
public interface CustomerMetaRepo extends JpaRepository<CustomerMeta,Long>{
    @Query(value="select * from customer_meta where bldcodefinal=:bldcodefinal",nativeQuery=true)
     List<CustomerMeta> findByBldcodefinal(@Param("bldcodefinal")String code);
     List<CustomerMeta> findByCin(String cin);


    @Query(value="select * from customer_meta where contractor=:contractor and feeder=:feeder and transformer=:transformer",nativeQuery=true)
    List<CustomerMeta> findByBuilding(@Param("contractor")String contractor, @Param("feeder") String feeder, @Param("transformer") String transformer);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.mapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;



/**
 *
 * @author Olakunle
 */
public class Mapper {
    
    public static <T, E> E convertObject(T source, Class<E> typeDestination) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(source, typeDestination);
    }

    public static <E, T> List<E> convertList(List<T> source, Type destinationType) {

        List<E> model = new ArrayList<>();
        if (source != null && destinationType != null) {

            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
            
            for(T rs:source){
              model.add(modelMapper.map(rs, destinationType));  
            }

        }

        return model;
    }
}

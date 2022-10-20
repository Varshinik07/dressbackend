package com.nestdigital.dressbackendapp.dao;

import com.nestdigital.dressbackendapp.model.DressModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DressDao extends CrudRepository<DressModel,Integer> {

    @Query(value = "SELECT `id`, `description`, `dressmodel`, `dressname`, `quantity` FROM `dress` WHERE `dressname`= :dressname",nativeQuery = true)
    List<DressModel> searchdress (String dressname);
}

package com.nestdigital.dressbackendapp.dao;

import com.nestdigital.dressbackendapp.model.DressModel;
import org.springframework.data.repository.CrudRepository;

public interface DressDao extends CrudRepository<DressModel,Integer> {
}

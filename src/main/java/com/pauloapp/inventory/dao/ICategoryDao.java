package com.pauloapp.inventory.dao;

import com.pauloapp.inventory.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryDao extends CrudRepository<Category, Long> {
    
}

package com.pauloapp.inventory.controller;

import com.pauloapp.inventory.model.Category;
import com.pauloapp.inventory.response.CategoryResponseRest;
import com.pauloapp.inventory.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
    
    @Autowired
    private ICategoryService service;
    
    /**
     * Get all the categories
     * @return 
     */    
    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseRest> searchCategories() {        
        return service.search();
    }
    
    /**
     * Get category by id
     * @param id
     * @return 
     */    
    @GetMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> searchCategoryById(@PathVariable Long id) {
        return service.searchById(id);
    }
    
    /**
     * Save a category
     * @param Category
     * @return 
     */    
    @PostMapping("/categories")
    public ResponseEntity<CategoryResponseRest> save(@RequestBody Category category) {
        return service.save(category);
    }
    
    /**
     * update categories
     * @param category
     * @param id
     * @return 
     */    
    @PutMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> udpate(@RequestBody Category category, @PathVariable Long id) {
        return service.update(category, id);
    }
}
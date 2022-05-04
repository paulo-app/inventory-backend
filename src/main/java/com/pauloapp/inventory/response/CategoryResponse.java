package com.pauloapp.inventory.response;

import com.pauloapp.inventory.model.Category;
import java.util.List;
import lombok.Data;

@Data
public class CategoryResponse {
    
    private List<Category> categories;
}

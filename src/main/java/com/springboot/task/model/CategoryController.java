package com.springboot.task.model;
import com.springboot.task.controller.Category;
import com.springboot.task.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping("/categories/{id}")
    public Optional<Category> getCategory(@PathVariable int id){
        return categoryService.getCategory(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/categories")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteTopic(@PathVariable int id){
        categoryService.deleteCategory(id);
    }
}

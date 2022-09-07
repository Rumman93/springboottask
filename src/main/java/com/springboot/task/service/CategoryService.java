package com.springboot.task.service;
import com.springboot.task.controller.Category;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryService {
    private List<Category> categories=new ArrayList<>(Arrays.asList(
            new Category(1,"Platinum", "High"),
            new Category(2,"Gold", "Medium"),
            new Category(3,"Silver", "Low")
    ));

    public List<Category> getAllCategories(){
        return categories;
    }
    public Optional<Category> getCategory(int id){
        Optional<Category> option1;
        option1= Optional.of(categories.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get());
        if(option1.isEmpty()){
            throw new ArithmeticException("mean of empty collection");
        }
        else return option1;
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public void deleteCategory(int id){
        categories.removeIf(t->t.getId()==id);
    }

}

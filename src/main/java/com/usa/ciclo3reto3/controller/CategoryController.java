package com.usa.ciclo3reto3.controller;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
    public List<Category> getCategory(){
        return categoryService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }


    @GetMapping ("/{id}")
    public Optional<Category> getCategorys(@PathVariable("id") int categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @PostMapping ("update")
    public Category update(@RequestBody Category category){return categoryService.update(category);}

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int categoryId) {return categoryService.delete(categoryId);}

}

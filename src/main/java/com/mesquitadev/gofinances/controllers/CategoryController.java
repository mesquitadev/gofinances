package com.mesquitadev.gofinances.controllers;

import com.mesquitadev.gofinances.models.Category;
import com.mesquitadev.gofinances.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping("v1/categories")
    public ResponseEntity<List<Category>> findAllCategories() {
        List<Category> categories = categoryService.findAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}

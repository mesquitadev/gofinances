package com.mesquitadev.gofinances.service;

import com.mesquitadev.gofinances.models.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAllCategories();
}

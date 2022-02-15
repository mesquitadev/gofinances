package com.mesquitadev.gofinances.service.impl;

import com.mesquitadev.gofinances.models.Category;
import com.mesquitadev.gofinances.repository.ICategoryRepository;
import com.mesquitadev.gofinances.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements ICategoryService {

    private final ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }
}

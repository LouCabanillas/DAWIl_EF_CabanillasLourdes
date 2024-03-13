package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.CategoryEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.CategoryRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repository;

    @Override
    public List<CategoryEntity> listar() {
        return repository.findAll();
    }

    @Override
    public CategoryEntity add(CategoryEntity o) {
        return repository.save(o);
    }

    @Override
    public CategoryEntity search(Long id) {
        return repository.findById(id).orElse(new CategoryEntity());
    }

    @Override
    public CategoryEntity update(CategoryEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

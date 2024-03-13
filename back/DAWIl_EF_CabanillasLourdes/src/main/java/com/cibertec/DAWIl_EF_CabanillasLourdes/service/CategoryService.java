package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {

    public List<CategoryEntity> listar();
    public CategoryEntity add(CategoryEntity o);
    public CategoryEntity search(Long id);
    public CategoryEntity update(CategoryEntity o);
    public void delete(Long id);

}

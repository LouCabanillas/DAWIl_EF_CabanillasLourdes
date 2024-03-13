package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.ProjectEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.ProjectRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository repository;

    @Override
    public List<ProjectEntity> listar() {
        return repository.findAll();
    }

    @Override
    public ProjectEntity add(ProjectEntity o) {
        return repository.save(o);
    }

    @Override
    public ProjectEntity search(Long id) {
        return repository.findById(id).orElse(new ProjectEntity());
    }

    @Override
    public ProjectEntity update(ProjectEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

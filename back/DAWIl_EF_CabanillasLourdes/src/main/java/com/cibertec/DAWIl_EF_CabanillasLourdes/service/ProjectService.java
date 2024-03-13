package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.PriorityEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.ProjectEntity;

import java.util.List;

public interface ProjectService {

    public List<ProjectEntity> listar();
    public ProjectEntity add(ProjectEntity o);
    public ProjectEntity search(Long id);
    public ProjectEntity update(ProjectEntity o);
    public void delete(Long id);

}

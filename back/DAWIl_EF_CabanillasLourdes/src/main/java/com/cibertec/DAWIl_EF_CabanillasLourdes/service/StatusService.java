package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.ProjectEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.StatusEntity;

import java.util.List;

public interface StatusService {

    public List<StatusEntity> listar();
    public StatusEntity add(StatusEntity o);
    public StatusEntity search(Long id);
    public StatusEntity update(StatusEntity o);
    public void delete(Long id);

}

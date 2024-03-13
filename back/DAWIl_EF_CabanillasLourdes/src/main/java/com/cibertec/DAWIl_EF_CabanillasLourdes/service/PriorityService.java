package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.KindEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.PriorityEntity;

import java.util.List;

public interface PriorityService {

    public List<PriorityEntity> listar();
    public PriorityEntity add(PriorityEntity o);
    public PriorityEntity search(Long id);
    public PriorityEntity update(PriorityEntity o);
    public void delete(Long id);

}

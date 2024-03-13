package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.CategoryEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.KindEntity;

import java.util.List;

public interface KindService {

    public List<KindEntity> listar();
    public KindEntity add(KindEntity o);
    public KindEntity search(Long id);
    public KindEntity update(KindEntity o);
    public void delete(Long id);

}

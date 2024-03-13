package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.StatusEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.StatusRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository repository;

    @Override
    public List<StatusEntity> listar() {
        return repository.findAll();
    }

    @Override
    public StatusEntity add(StatusEntity o) {
        return repository.save(o);
    }

    @Override
    public StatusEntity search(Long id) {
        return repository.findById(id).orElse(new StatusEntity());
    }

    @Override
    public StatusEntity update(StatusEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

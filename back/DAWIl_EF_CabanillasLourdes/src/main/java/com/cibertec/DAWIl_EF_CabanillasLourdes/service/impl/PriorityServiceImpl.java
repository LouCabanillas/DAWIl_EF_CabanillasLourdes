package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.PriorityEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.PriorityRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {

    @Autowired
    PriorityRepository repository;

    @Override
    public List<PriorityEntity> listar() {
        return repository.findAll();
    }

    @Override
    public PriorityEntity add(PriorityEntity o) {
        return repository.save(o);
    }

    @Override
    public PriorityEntity search(Long id) {
        return repository.findById(id).orElse(new PriorityEntity());
    }

    @Override
    public PriorityEntity update(PriorityEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

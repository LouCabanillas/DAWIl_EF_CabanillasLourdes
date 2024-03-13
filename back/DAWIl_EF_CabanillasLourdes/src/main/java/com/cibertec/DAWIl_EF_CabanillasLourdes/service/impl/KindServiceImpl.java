package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.KindEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.KindRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindServiceImpl implements KindService {

    @Autowired
    KindRepository repository;

    @Override
    public List<KindEntity> listar() {
        return repository.findAll();
    }

    @Override
    public KindEntity add(KindEntity o) {
        return repository.save(o);
    }

    @Override
    public KindEntity search(Long id) {
        return repository.findById(id).orElse(new KindEntity());
    }

    @Override
    public KindEntity update(KindEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

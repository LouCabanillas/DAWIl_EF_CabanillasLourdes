package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.TicketEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.TicketRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository repository;

    @Override
    public List<TicketEntity> listar() {
        return repository.findAll();
    }

    @Override
    public TicketEntity add(TicketEntity o) {
        return repository.save(o);
    }

    @Override
    public TicketEntity search(Long id) {
        return repository.findById(id).orElse(new TicketEntity());
    }

    @Override
    public TicketEntity update(TicketEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

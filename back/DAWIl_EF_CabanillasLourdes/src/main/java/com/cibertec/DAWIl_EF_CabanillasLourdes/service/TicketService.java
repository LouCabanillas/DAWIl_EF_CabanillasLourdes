package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.StatusEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.TicketEntity;

import java.util.List;

public interface TicketService {

    public List<TicketEntity> listar();
    public TicketEntity add(TicketEntity o);
    public TicketEntity search(Long id);
    public TicketEntity update(TicketEntity o);
    public void delete(Long id);

}

package com.cibertec.DAWIl_EF_CabanillasLourdes.service;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.TicketEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> listar();
    public UserEntity add(UserEntity o);
    public UserEntity search(Long id);
    public UserEntity update(UserEntity o);
    public void delete(Long id);

}

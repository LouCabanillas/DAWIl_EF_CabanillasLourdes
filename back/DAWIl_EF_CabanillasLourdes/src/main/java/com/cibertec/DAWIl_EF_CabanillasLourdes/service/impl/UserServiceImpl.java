package com.cibertec.DAWIl_EF_CabanillasLourdes.service.impl;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.UserEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.repository.UserRepository;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<UserEntity> listar() {
        return repository.findAll();
    }

    @Override
    public UserEntity add(UserEntity o) {
        return repository.save(o);
    }

    @Override
    public UserEntity search(Long id) {
        return repository.findById(id).orElse(new UserEntity());
    }

    @Override
    public UserEntity update(UserEntity o) {
        return repository.save(o);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

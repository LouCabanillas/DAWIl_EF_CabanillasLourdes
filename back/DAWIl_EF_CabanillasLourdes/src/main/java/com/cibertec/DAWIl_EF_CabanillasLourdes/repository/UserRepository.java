package com.cibertec.DAWIl_EF_CabanillasLourdes.repository;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>  {

    Optional<UserEntity> findByUsername(String username);

}

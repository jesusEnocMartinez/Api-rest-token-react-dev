package com.softpro.mx.repository;

import com.softpro.mx.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepositoryImpl extends JpaRepository<UsuariosEntity,Integer>,UsuariosRepository {

}

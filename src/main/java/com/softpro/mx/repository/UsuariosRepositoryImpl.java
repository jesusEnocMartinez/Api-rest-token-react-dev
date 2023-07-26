package com.softpro.mx.repository;

import com.softpro.mx.dto.MensualidadesDto;
import com.softpro.mx.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepositoryImpl extends
        JpaRepository<UsuariosEntity,Integer>,UsuariosRepository {

    @Query("SELECT new com.softpro.mx.dto.MensualidadesDto(m.nombre, m.mensualidad, m.metodoPago) FROM UsuariosEntity m WHERE m.idUsuario = :idUsuario")
    MensualidadesDto findMensualidadesByIdUsuario
            (@Param("idUsuario") Integer idUsuario);

}

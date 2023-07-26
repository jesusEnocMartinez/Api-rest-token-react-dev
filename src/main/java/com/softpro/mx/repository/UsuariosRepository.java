package com.softpro.mx.repository;

import com.softpro.mx.dto.MensualidadesDto;
import org.springframework.data.repository.query.Param;

public interface UsuariosRepository {
    MensualidadesDto MensualudadesFin (@Param("idUsuario")Integer idUsuario);
}

package com.softpro.mx.service;

import com.softpro.mx.dto.MensualidadesDto;
import com.softpro.mx.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService{
    @Autowired
    private UsuariosRepository usuariosRepository;
    @Override
    public MensualidadesDto getMensualidadesByUsuarioId(Integer idUsuario) {
        return usuariosRepository.MensualudadesFin(idUsuario);
    }

}

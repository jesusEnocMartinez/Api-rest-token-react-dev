package com.softpro.mx.service;

import com.softpro.mx.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl extends UsuariosService{
    @Autowired
    private UsuariosRepository usuariosRepository;
}

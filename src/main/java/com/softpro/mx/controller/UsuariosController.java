package com.softpro.mx.controller;

import com.softpro.mx.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;
}

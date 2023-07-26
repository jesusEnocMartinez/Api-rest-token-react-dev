package com.softpro.mx.controller;

import com.softpro.mx.dto.MensualidadesDto;
import com.softpro.mx.service.UsuariosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;
    private final Logger logger = LoggerFactory.getLogger(UsuariosController.class);
    @GetMapping("/{idUsuario}/mensualidades")
    public ResponseEntity<MensualidadesDto> getMensualidadesByUsuarioId(@PathVariable Integer idUsuario) {
        try {
            MensualidadesDto mensualidades = usuariosService.getMensualidadesByUsuarioId(idUsuario);
            if (mensualidades != null) {
                return new ResponseEntity<>(mensualidades, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error("Error al obtener las mensualidades para el idUsuario: {}", idUsuario, e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

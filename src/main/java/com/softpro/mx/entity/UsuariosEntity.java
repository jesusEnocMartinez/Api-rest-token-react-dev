package com.softpro.mx.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private String Mensualidad;
    private String metodoPago;
    private String codigoQr;
    private LocalDateTime alta;
    private LocalDateTime baja;

}

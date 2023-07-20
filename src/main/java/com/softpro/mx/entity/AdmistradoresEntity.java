package com.softpro.mx.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Admistradores")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AdmistradoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin;
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;
    private LocalDateTime alta;
    private LocalDateTime baja;
}

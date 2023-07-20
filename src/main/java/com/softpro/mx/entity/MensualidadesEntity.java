package com.softpro.mx.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Mensualidades")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MensualidadesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMen;
    private String nombre;
    private String email;
    private String vencimiento;
    private String comentario;
    private String rol;
    private String metodoPago;
    private LocalDateTime alta;
    private LocalDateTime baja;

}

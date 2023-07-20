package com.softpro.mx.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Categorias")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoriasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCate;
    private String nombre;
    private String vencimiento;
    private String comentario;
    private String rol;
    private String urlImagen;
    private LocalDateTime alta;
    private LocalDateTime baja;

}

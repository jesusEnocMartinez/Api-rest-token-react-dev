package com.softpro.mx.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MensualidadesDto {
    private Integer idUsuario;
    private String nombre;
    private String Mensualidad;
    private String metodoPago;

    @Override
    public String toString() {
        return "MensualidadesDto{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", Mensualidad='" + Mensualidad + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                '}';
    }
}

package com.corenetworks.Examen070224.Ejercicio1.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    private String nombre;
    private double precio;


}

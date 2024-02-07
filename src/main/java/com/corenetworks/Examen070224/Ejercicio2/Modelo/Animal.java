package com.corenetworks.Examen070224.Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    @Column(length = 1, nullable = false)
    private char sexo;
    @Column (nullable = false)
    private LocalDate fNacimiento;
    @Column(nullable = false)
    private int idPais;

    @ManyToOne
    @JoinColumn(name="id_Especie", nullable = false, foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especie e1;


}

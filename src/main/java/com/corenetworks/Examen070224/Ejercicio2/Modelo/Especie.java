package com.corenetworks.Examen070224.Ejercicio2.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60, nullable = false)
    private String nombreCientifico;
    @Column(length = 60, nullable = false)
    private String nombreVulgar;
    @Column(nullable = false)
    private Boolean extincion;

    @OneToMany(mappedBy = "e1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    List<Animal> animales;

}

package com.corenetworks.Examen070224.Ejercicio1.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@Component("ivaSuperReducido")
@Primary
public class IvaSuperReducido implements IImpuesto{

    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.16;
    }
}

package com.corenetworks.Examen070224.Ejercicio1.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Factura {
    @Autowired
    private IImpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura() {
        double total = 0;
        for (Producto elemento :
                productos) {
            total += elemento.getPrecio() + impuesto.calcularImpuesto(elemento);
        }
        return total;
    }
}


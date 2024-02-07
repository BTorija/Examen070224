package com.corenetworks.Examen070224;

import com.corenetworks.Examen070224.Ejercicio1.Modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen070224Application implements CommandLineRunner {
	@Autowired
	Factura f1;

	public static void main(String[] args) {
		SpringApplication.run(Examen070224Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = new ArrayList<>();
		Producto p1=new Producto("chaqueta",18);
		Producto p2=new Producto("pantalones",25);
		Producto p3=new Producto("traje",78);
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);




		f1.setProductos(productos);
		System.out.println("Factura con Iva General " + f1.calcularTotalFactura());

		System.out.println("Factura con IVA reducido " + f1.calcularTotalFactura());






	}
}

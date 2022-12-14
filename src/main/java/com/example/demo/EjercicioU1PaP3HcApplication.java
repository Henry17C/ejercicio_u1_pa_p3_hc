package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3HcApplication   implements CommandLineRunner{

	public static void main(String[] args)  {
		SpringApplication.run(EjercicioU1PaP3HcApplication.class, args);
	}

	@Autowired
	IVehiculoService iVehiculoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		///Crear un vehiculo
		Vehiculo ve = new Vehiculo();
		ve.setPlaca("E1345");
		ve.setTipo("liviano");
		ve.setPrecio(new BigDecimal(20000));
		ve.setMarca("Mazda");
		this.iVehiculoService.insertar(ve);
		
		
		//actualizar

		Propietario pro = new Propietario();
		pro.setApellido(null);
		pro.setCedula(null);
		pro.setFechaNacimiento(null);
		pro.setNombre(null);
		
	}

}

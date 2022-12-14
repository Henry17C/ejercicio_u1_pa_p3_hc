package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IMatriculaService {

	
	public Vehiculo actualizar(String placa, String cedula);
}

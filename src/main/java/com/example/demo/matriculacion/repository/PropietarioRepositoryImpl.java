package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	
	private static List<Propietario> basePropietario = new ArrayList<>();

	@Override
	public Propietario buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Propietario propietario) {
		
		this.basePropietario.add(propietario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

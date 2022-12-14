package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	
	public Propietario buscarPorNombre(String nombre);
	public Propietario buscar(Integer id);
	public void actualizar(Propietario propietario);
	public void insertar(Propietario  propietario);
	public void borrar(Integer id);
	

}

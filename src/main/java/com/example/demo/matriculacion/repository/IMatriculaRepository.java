package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {
	public Matricula buscarPorPlaca(String placa);
	public void actualizar(Matricula matricula);
	public void insertar(Matricula matricula);
	public void borrar(Integer id);
	

}

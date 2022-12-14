package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public Vehiculo buscarPorPlaca(String placa);
	public Vehiculo buscar(Integer id);
	public void actualizar(Vehiculo vehiculo);
	public void insertar(Vehiculo  vehiculo);
	public void borrar(Integer id);

}

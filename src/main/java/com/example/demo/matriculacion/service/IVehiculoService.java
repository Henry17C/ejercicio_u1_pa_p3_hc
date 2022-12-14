package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	public Vehiculo actualizar(String placaActual, String precioActual, String placa, String precio);
	public void insertar(Vehiculo  vehiculo);

}

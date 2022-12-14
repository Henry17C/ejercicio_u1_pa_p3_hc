package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
  @Autowired
  IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		this.iVehiculoRepository.insertar(vehiculo);
		
	}
	@Override
	public Vehiculo actualizar(String placaActual, String precioActual, String placa, String precio) {
		// TODO Auto-generated method stub
		
		Vehiculo ve = new Vehiculo();
		ve.setPlaca(placa);
		ve.setPrecio(new BigDecimal(2000));
		
		this.iVehiculoRepository.actualizar(null);
		return null;
	}

}

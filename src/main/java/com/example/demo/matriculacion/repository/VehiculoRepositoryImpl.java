package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	
	private static List<Vehiculo> baseVehiculo = new ArrayList<>();


	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
	
		Vehiculo ve1 = null;
		for (Vehiculo ve : baseVehiculo) {
			if (ve.getMarca().equals(vehiculo.getMarca()) && ve.getPlaca().equals(vehiculo.getPlaca()) ) {
				ve1=ve;
				
				//
				break;
			}
		}
		baseVehiculo.remove(ve1);
		baseVehiculo.add(vehiculo);
		System.out.println("Se actualiza la cuenta bancaria "+ vehiculo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		this.baseVehiculo.add(vehiculo);

		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

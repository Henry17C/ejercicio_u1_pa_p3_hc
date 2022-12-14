package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {


	private static List<Matricula> baseMatricula = new ArrayList<>();
	
	@Override
	public Matricula buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Matricula matricula) {
//		CuentaBancaria cuenta = null;
//		for (CuentaBancaria cb : baseCuentas) {
//			if (cb.getNumero().equals(cuentaBancaria.getNumero())) {
//				cuenta=cb;
//				
//				//
//				break;
//			}
//		}
//		baseCuentas.remove(cuenta);
//		baseCuentas.add(cuentaBancaria);
//		System.out.println("Se actualiza la cuenta bancaria "+ cuentaBancaria);
//		// TODO Auto-generated method stub
	}

	@Override
	public void insertar(Matricula matricula) {
		
		this.baseMatricula.add(matricula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

}

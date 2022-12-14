package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.repository.IPropietarioRepository;
import com.example.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	  @Autowired
	  IPropietarioRepository iVehiculoRepository;
	
	@Override
	public void insertar(Propietario propietario) {
		this.iVehiculoRepository.insertar(propietario);
		
	}

}

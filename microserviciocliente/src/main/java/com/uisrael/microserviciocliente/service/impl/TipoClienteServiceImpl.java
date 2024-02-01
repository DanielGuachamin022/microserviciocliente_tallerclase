package com.uisrael.microserviciocliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.microserviciocliente.model.TipoCliente;
import com.uisrael.microserviciocliente.repository.ITipoClienteRepository;
import com.uisrael.microserviciocliente.service.ITipoClienteService;

@Service
@Component
public class TipoClienteServiceImpl implements ITipoClienteService {

	@Autowired
	private ITipoClienteRepository repo;

	@Override
	public void insertarTipoCliente(TipoCliente nuevoTipoCliente) {
		// TODO Auto-generated method stub
		try {
			repo.save(nuevoTipoCliente);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<TipoCliente> listarTiposCliente() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			throw e;
		}
	}
}

package com.uisrael.microserviciocliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.microserviciocliente.model.Cliente;
import com.uisrael.microserviciocliente.repository.IClienteRepository;
import com.uisrael.microserviciocliente.service.IClienteService;

@Service
@Component
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepository repo;

	@Override
	public void insertarCliente(Cliente nuevo) {

		try {
			repo.save(nuevo);
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public List<Cliente> listarCliente() {
		try {
			return repo.findAll();
		} catch (Exception e) {
			throw e;
		}
	}
}

package com.uisrael.microserviciocliente.service;

import java.util.List;

import com.uisrael.microserviciocliente.model.Cliente;

public interface IClienteService {
	public void insertarCliente(Cliente nuevo);

	public List<Cliente> listarCliente();
}

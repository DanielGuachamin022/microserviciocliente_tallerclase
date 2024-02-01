package com.uisrael.microserviciocliente.service;

import java.util.List;

import com.uisrael.microserviciocliente.model.TipoCliente;

public interface ITipoClienteService {
	public void insertarTipoCliente(TipoCliente nuevoTipoCliente);

	public List<TipoCliente> listarTiposCliente();
}

package com.uisrael.microserviciocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.microserviciocliente.model.Cliente;
import com.uisrael.microserviciocliente.service.IClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/cliente")
@Getter
@Setter
@RefreshScope
public class ClienteController {
	@Autowired
	private IClienteService servicio;

	@PostMapping("/guardarcliente")
	@ResponseStatus(value = HttpStatus.OK)
	public void guardarCliente(@RequestBody Cliente nuevoCliente) {
		servicio.insertarCliente(nuevoCliente);
	}

	@GetMapping("/listarclientes")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Cliente> listarCliente() {
		return servicio.listarCliente();
	}
}

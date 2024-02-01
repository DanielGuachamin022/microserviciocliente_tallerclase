package com.uisrael.microserviciocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.microserviciocliente.model.TipoCliente;
import com.uisrael.microserviciocliente.service.ITipoClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/tipocliente")
@Getter
@Setter
public class TipoClienteController {

	@Autowired
	private ITipoClienteService servicio;

	@PostMapping("/guardartipocliente")
	@ResponseStatus(value = HttpStatus.OK)
	public void guardarTipoCliente(@RequestBody TipoCliente nuevoTipoCliente) {
		servicio.insertarTipoCliente(nuevoTipoCliente);
	}

	@GetMapping("/listartipoclientes")
	@ResponseStatus(value = HttpStatus.OK)
	public List<TipoCliente> listarCliente() {
		return servicio.listarTiposCliente();
	}
}

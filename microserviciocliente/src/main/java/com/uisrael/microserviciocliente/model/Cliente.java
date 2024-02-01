package com.uisrael.microserviciocliente.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	@Id
	private String idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String direccionCliente;
	private String fonoCliente;
	private String ciCliente;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimientoCliente;
	private boolean estadoCliente;
}

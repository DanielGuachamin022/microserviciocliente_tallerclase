package com.uisrael.microserviciocliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "tipocliente")
@Getter
@Setter
@NoArgsConstructor
public class TipoCliente {

	@Id
	private String idTipoCliente;
	private String nombreTipoCliente;
	private String descricionTipoCliente;
	private boolean estadoTipoCliente;
}

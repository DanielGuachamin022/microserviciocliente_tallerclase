package com.uisrael.microserviciocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.microserviciocliente.model.TipoCliente;

@Repository
public interface ITipoClienteRepository extends MongoRepository<TipoCliente, String> {

}

package com.uisrael.microserviciocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.microserviciocliente.model.Cliente;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {

}

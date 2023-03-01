package br.dio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.dio.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
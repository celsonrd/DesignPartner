package br.dio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.dio.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
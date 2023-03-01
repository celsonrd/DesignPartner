package br.dio.service;

import br.dio.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface ClienteService {

	Iterable<Cliente> getAll();

	Cliente getById(Long id);

	void insert(Cliente cliente);

	void update(Long id, Cliente cliente);

	void del(Long id);

}

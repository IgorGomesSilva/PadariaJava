package br.com.padaria.dao;

import javax.ejb.*;

import br.com.padaria.entidade.Cliente;

@Stateless
public class ClienteDAO extends GenericDAO<Cliente> {
	
	public ClienteDAO(){
		super(Cliente.class);
	}
}

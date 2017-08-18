package br.com.padaria.dao;

import javax.ejb.*;

import br.com.padaria.entidade.Cliente;

@Stateless
public class TelefoneDAO extends GenericDAO<Cliente> {
	
	public TelefoneDAO(){
		super(Cliente.class);
	}
}

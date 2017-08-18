package br.com.padaria.dao;

import javax.ejb.*;

import br.com.padaria.entidade.Endereco;

@Stateless
public class EnderecoDAO extends GenericDAO<Endereco> {
	
	public EnderecoDAO(){
		super(Endereco.class);
	}
}

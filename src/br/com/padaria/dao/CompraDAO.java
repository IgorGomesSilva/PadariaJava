package br.com.padaria.dao;

import javax.ejb.*;

import br.com.padaria.entidade.Compra;

@Stateless
public class CompraDAO extends GenericDAO<Compra> {
	
	public CompraDAO(){
		super(Compra.class);
	}
}

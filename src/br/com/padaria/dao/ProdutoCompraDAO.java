package br.com.padaria.dao;

import javax.ejb.*;

import br.com.padaria.entidade.ProdutoCompra;

@Stateless
public class ProdutoCompraDAO extends GenericDAO<ProdutoCompra> {
	
	public ProdutoCompraDAO(){
		super(ProdutoCompra.class);
	}
}

package br.com.padaria.dao;

import javax.ejb.*;

import java.util.List;
import javax.persistence.*;

import br.com.padaria.entidade.Produto;

@Stateless
public class ProdutoDAO extends GenericDAO<Produto> {

	public ProdutoDAO(){
		super(Produto.class);
	}
	
	public List<Produto> consultaPorPreco
					(Double precoInicial, Double precoFinal){
		
		TypedQuery<Produto> query 
				= super.em.createQuery("select p from Produto as p "
						+ "where v.valor between :v1 and :v2 ", Produto.class);
		
		query.setParameter("v1", precoInicial);
		query.setParameter("v2", precoFinal);
		
		
		
		return query.getResultList();
	}
}

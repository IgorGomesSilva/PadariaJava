package br.com.padaria.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.padaria.dao.CompraDAO;

import br.com.padaria.entidade.Compra;
import br.com.padaria.util.Mensagem;

@ManagedBean
public class CompraController {
	
private Compra compra;
	
	
	@EJB
	private CompraDAO compraDAO;
	
	public CompraController(){
		this.compra = new Compra();
	}
	
	public List<Compra> consultar(){
		return compraDAO.todos();
	}
	
	public void salvar(){
		
		
		String erro = compraDAO.salvar(compra);
		if(erro == null){
			Mensagem.sucesso("Salvo");
			this.compra = new Compra();
		}
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public CompraDAO getCompraDAO() {
		return compraDAO;
	}

	public void setCompraDAO(CompraDAO compraDAO) {
		this.compraDAO = compraDAO;
	}
	
	
	

}

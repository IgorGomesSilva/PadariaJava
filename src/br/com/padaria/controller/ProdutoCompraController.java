package br.com.padaria.controller;

import br.com.padaria.dao.*;
import br.com.padaria.entidade.*;
import br.com.padaria.util.*;

import javax.ejb.*;
import javax.faces.bean.*;
import java.util.*;

@ManagedBean
public class ProdutoCompraController {

	private ProdutoCompra produtoCompra;
	
	@EJB
	private ProdutoCompraDAO produtoCompraDAO;
	
	public ProdutoCompraController(){
		this.produtoCompra = new ProdutoCompra();
	}

	public void salvar(){
		String erro = produtoCompraDAO.salvar(produtoCompra);
		
		if(erro == null){ 
			Mensagem.sucesso("Operação realizada com sucesso.");
			this.produtoCompra = new ProdutoCompra();
		}else{
			Mensagem.erro("Erro: "+erro);
		}
		
	}
	
	public void excluir(ProdutoCompra produtoCompra){
		String erro = produtoCompraDAO.excluir(produtoCompra.getProdutoCompraId());
	
		if(erro == null){
			Mensagem.sucesso("Excluído com sucesso");
		}else{
			Mensagem.erro("Erro: "+erro);
		}
	}
	
	public List<ProdutoCompra> consultar(){
		return produtoCompraDAO.todos();
	}

	public ProdutoCompra getProdutoCompra() {
		return produtoCompra;
	}

	public void setProdutoCompra(ProdutoCompra produtoCompra) {
		this.produtoCompra = produtoCompra;
	}

	public ProdutoCompraDAO getProdutoCompraDAO() {
		return produtoCompraDAO;
	}

	public void setProdutoCompraDAO(ProdutoCompraDAO produtoCompraDAO) {
		this.produtoCompraDAO = produtoCompraDAO;
	}
	
	
	
	
	
}

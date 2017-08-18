package br.com.padaria.controller;

import java.util.List;

import javax.ejb.*;

import br.com.padaria.dao.ProdutoDAO;
import br.com.padaria.entidade.Produto;
import br.com.padaria.util.Mensagem;

import javax.faces.bean.*;

@ManagedBean
public class ProdutoController {

private Produto produto;
	
	@EJB
	private ProdutoDAO produtoDAO;
	
	public ProdutoController(){
		this.produto = new Produto();
	}

	public void salvar(){
		String erro = produtoDAO.salvar(produto);
		
		if(erro == null){ //Não houve erros
			Mensagem.sucesso("Operação realizada com sucesso.");
			this.produto = new Produto();//Limpar o form
		}else{
			Mensagem.erro("Erro: "+erro);
			
		}
		
	}
	
	

	public void excluir(Produto produto){
		String erro = produtoDAO.excluir(produto.getIdProduto());
	
		if(erro == null){
			Mensagem.sucesso("Excluído com sucesso");
		}else{
			Mensagem.erro("Erro: "+erro);
		}
	}
	
	
	public void editar(Produto produtoEditado){
		this.produto = produtoEditado;
	}
	
	
	public List<Produto> consultar(){
		return produtoDAO.todos();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}

	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}
	
	
	
	
}

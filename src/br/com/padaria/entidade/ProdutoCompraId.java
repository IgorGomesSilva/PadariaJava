package br.com.padaria.entidade;

import javax.persistence.Embeddable;

@Embeddable
public class ProdutoCompraId {
	
	private Integer idProduto ;
	
	private Integer idCompra ;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	
	
	
	

}

package br.com.padaria.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Date;


@Entity
public class ProdutoCompra {

	@EmbeddedId
	private ProdutoCompraId id ;
	
	
	@NotNull(message="Informe a descrição")
	private String descricao;
	
	private Double valor ;
	
	private Date data ;
	
	@ManyToOne
	@JoinColumn(name="idCompra")
	@MapsId("idCompra")
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name="idProduto")
	@MapsId("idProduto")
	private Produto produto ;

	public ProdutoCompraId getId() {
		return id;
	}

	public void setId(ProdutoCompraId id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Serializable getProdutoCompraId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


	


	
}

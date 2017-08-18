package br.com.padaria.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCompra;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCompra;
	
	private Double valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy="compra")
	private List<ProdutoCompra> produtoCompras;

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ProdutoCompra> getProdutoCompras() {
		return produtoCompras;
	}

	public void setProdutoCompras(List<ProdutoCompra> produtoCompras) {
		this.produtoCompras = produtoCompras;
	}

	

	
	
	
}

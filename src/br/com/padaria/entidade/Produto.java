package br.com.padaria.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity

public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProduto;
	
	@NotNull(message="Informe o Nome")
	private String nome;
	
	@NotNull(message="Informe o valor")
	private Double valor;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	

	
	
	
	
}

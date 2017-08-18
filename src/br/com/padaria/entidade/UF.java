package br.com.padaria.entidade;

import java.util.List;
import javax.persistence.*;

@Entity
public class UF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUF ;
	
	private String descric�o ;
	
	@OneToMany (mappedBy = "endereco")
	private List <Endereco> enderecos ;
	
	

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Integer getIdUF() {
		return idUF;
	}

	public void setIdUF(Integer idUF) {
		this.idUF = idUF;
	}

	public String getDescric�o() {
		return descric�o;
	}

	public void setDescric�o(String descric�o) {
		this.descric�o = descric�o;
	}
	
	

}

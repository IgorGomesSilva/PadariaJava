package br.com.padaria.entidade;

import javax.persistence.*;
import java.util.*;

@Entity
public class TipoTelefone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTipoTelefone ;
	
	private String descricao ;
	
	@OneToMany (mappedBy ="tipotelefone")
	private List<Telefone> telefones;
	

	public Integer getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone(Integer idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}

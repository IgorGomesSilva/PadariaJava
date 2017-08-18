package br.com.padaria.entidade;

import javax.persistence.*;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTelefone ;
	
	private long numeroTelefone ;
	
	@ManyToMany
	@JoinColumn (name ="idTipoTelefone")
	private TipoTelefone tipotelefone ;

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public long getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(long numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public TipoTelefone getTipotelefone() {
		return tipotelefone;
	}

	public void setTipotelefone(TipoTelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}
	
	
	
	

}

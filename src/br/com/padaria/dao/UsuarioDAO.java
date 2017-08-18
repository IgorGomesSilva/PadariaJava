package br.com.padaria.dao;

import br.com.padaria.entidade.Usuario;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

@Stateless
public class UsuarioDAO extends GenericDAO<Usuario>{
	
	public UsuarioDAO(){
		super(Usuario.class);
	}
	
	public Usuario getUsuario(String nomeUsuario, String senha){
		try{
			Usuario usuario = (Usuario) em
						.createQuery(
									"SELECT u from Usuario u where u.user = :name and u.pass = :senha")
						.setParameter("name", nomeUsuario)
						.setParameter("senha", senha).getSingleResult();
			
			return usuario;
		}catch(NoResultException e){
			return null;
		}
	}
	
}
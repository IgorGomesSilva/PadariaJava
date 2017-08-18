package br.com.padaria.controller;


import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.padaria.dao.UsuarioDAO;
import br.com.padaria.entidade.Usuario;
import br.com.padaria.util.Mensagem;


@ManagedBean
public class UsuarioController {
	
	
private Usuario usuario;
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	public UsuarioController(){
		this.usuario = new Usuario();
	}
	
	public void salvar(){
		String erro = usuarioDAO.salvar(usuario);
		if(erro==null){
			Mensagem.sucesso("Salvo com sucesso!");
		}else{
			Mensagem.erro("Erro ao salvar!");
		}
	}
	
	public void excluir(){
		String erro = usuarioDAO.excluir(usuario.getCodigoUsuario());
		if(erro==null){
			Mensagem.sucesso("Salvo com sucesso!");
		}else{
			Mensagem.erro("Erro ao salvar!");
		}
	}
	
	public void entrar(){
		Usuario erro = usuarioDAO.getUsuario(usuario.getUser(), usuario.getPass());
		if(erro==null){
			Mensagem.sucesso("Login");
			//return "cadastro/produto.xhtml";
		}else{
			Mensagem.erro("Erro");
			//return null;
		}
	}
	
	public String logar(){
		usuario = usuarioDAO.getUsuario(usuario.getUser(), usuario.getPass());
		if(usuario==null){
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
							"Erro no login!"));
			return null;
		}else{
			return "cadastro/produto.xhtml";
		}
	}
	
	public void editar(Usuario usuarioEditado){
		this.usuario = usuarioEditado;
	}
	
	public List<Usuario> consultar(){
		return usuarioDAO.todos();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	

	
	

}

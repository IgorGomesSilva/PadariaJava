package br.com.padaria.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.padaria.dao.ClienteDAO;
import br.com.padaria.entidade.Cliente;
import br.com.padaria.util.Mensagem;

@ManagedBean
public class ClienteController {
	
private Cliente cliente;
	
	
	@EJB
	private ClienteDAO clienteDAO;
	
	public ClienteController(){
		this.cliente = new Cliente();
	}
	
	public List<Cliente> consultar(){
		return clienteDAO.todos();
	}
	
	public void salvar(){
		
		
		String erro = clienteDAO.salvar(cliente);
		if(erro == null){
			Mensagem.sucesso("Salvo");
			this.cliente = new Cliente();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	

}

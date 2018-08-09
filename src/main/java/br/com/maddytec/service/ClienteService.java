package br.com.maddytec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Cliente;
import br.com.maddytec.repository.Clientes;

@Service
public class ClienteService {
	
	@Autowired
	Clientes clientes;
	
	public Cliente save(Cliente cliente) {
		return clientes.save(cliente);
	}
	
	public void delete(Long idCliente) {
	   clientes.deleteById(idCliente);
	}
	
	
	public Cliente findById(Long idCliente) {		
		return clientes.findById(idCliente).get();
	}
	
	public List<Cliente> findAll() {		
		return clientes.findAll(); 
	}
	
	
}

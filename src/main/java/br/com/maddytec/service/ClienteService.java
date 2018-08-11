package br.com.maddytec.service;

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
	
	public Cliente findById(Long id) {		
		return clientes.findById(id).get();
	}
	
	public List<Cliente> findAll() {		
		return clientes.findAll(); 
	}
	
	public void delete(Long id) {
		   clientes.deleteById(id);
		}
}

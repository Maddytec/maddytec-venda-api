package br.com.maddytec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Cliente;
import br.com.maddytec.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteSource {
	
	@Autowired
	ClienteService clienteService;
	
	@PostMapping
	public void save(@Valid @RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente findById(@PathVariable("id") Long id) {
		return clienteService.findById(id);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		clienteService.delete(codigo);
	}
}

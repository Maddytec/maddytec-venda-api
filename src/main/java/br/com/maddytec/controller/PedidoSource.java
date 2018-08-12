package br.com.maddytec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Pedido;
import br.com.maddytec.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoSource {

	@Autowired
	PedidoService pedidoService;
	
	@PostMapping
	public Pedido save(@Valid @RequestBody Pedido pedido) {
		return pedidoService.save(pedido); 
	}
	
	@GetMapping
	public List<Pedido> findAll(){
		return pedidoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Pedido findById(@PathVariable Long id) {
		return pedidoService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		pedidoService.deleteById(id);
	}
}

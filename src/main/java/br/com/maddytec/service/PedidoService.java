package br.com.maddytec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Pedido;
import br.com.maddytec.repository.Pedidos;

@Service
public class PedidoService {

	@Autowired
	Pedidos pedidos;
	
	public Pedido save(Pedido pedido) {
		return pedidos.save(pedido); 
	}
	
	public List<Pedido> findAll(){
		return pedidos.findAll();
	}
	
	public Pedido findById(Long id) {
		return pedidos.findById(id).get();
	}
	
	public void deleteById(Long id) {
		pedidos.deleteById(id);
	}
}

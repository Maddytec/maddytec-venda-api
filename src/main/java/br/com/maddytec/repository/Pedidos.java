package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.model.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Long> {

}

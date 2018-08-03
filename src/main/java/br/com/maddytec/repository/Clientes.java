package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}

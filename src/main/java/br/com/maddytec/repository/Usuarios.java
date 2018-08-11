package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

}

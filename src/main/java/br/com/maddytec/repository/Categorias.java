package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.model.Categoria;

public interface Categorias extends JpaRepository<Categoria, Long> {

}

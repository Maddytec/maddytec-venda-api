package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.model.Grupo;

public interface Grupos extends JpaRepository<Grupo, Long> {

}

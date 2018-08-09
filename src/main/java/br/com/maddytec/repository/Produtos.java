package br.com.maddytec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Produto;

@Service
public interface Produtos extends JpaRepository<Produto, Long> {

}

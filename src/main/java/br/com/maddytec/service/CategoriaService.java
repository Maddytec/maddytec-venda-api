package br.com.maddytec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Categoria;
import br.com.maddytec.repository.Categorias;

@Service
public class CategoriaService {
	
	@Autowired
	Categorias categorias;
	
	
	public Categoria save(Categoria categoria) {
		return categorias.save(categoria);
	}
	
	public void delete(Long idCategoria) {
	   categorias.deleteById(idCategoria);
	}
	
	public Categoria findById(Long id) {		
		return categorias.findById(id).get();
	}
	
	public List<Categoria> findAll() {		
		return categorias.findAll(); 
	}
}

package br.com.maddytec.controller;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Categoria;
import br.com.maddytec.repository.Categorias;
import br.com.maddytec.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaSource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private Categorias categorias;

	private Categoria categoria;
	private List<Categoria> categoriasRaizes;

	public CategoriaSource() {
		limpar();
	}

	private void limpar() {
		categoria = new Categoria();
	}

	public void inicializar() {

		if (this.categoria == null) {
			limpar();
		}
		
	}

	@PostMapping
	public void save(@Valid @RequestBody Categoria categoria) {
		categoriaService.save(categoria);
	}
	
	@GetMapping("/{id}")
	public Categoria findById(@PathVariable("id") Long id) {
		return categoriaService.findById(id);
	}
	
	@GetMapping
	public List<Categoria> findAll() {
		return categoriaService.findAll();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}

	public boolean isEditando() {
		return this.categoria.getId() != null;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public void setCategoriasRaizes(List<Categoria> categoriasRaizes) {
		this.categoriasRaizes = categoriasRaizes;
	}
}
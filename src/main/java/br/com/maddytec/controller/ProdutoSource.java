package br.com.maddytec.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Categoria;
import br.com.maddytec.model.Cliente;
import br.com.maddytec.model.Produto;
import br.com.maddytec.repository.Categorias;
import br.com.maddytec.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoSource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private Categorias categorias;

	@Autowired
	private ProdutoService produtoService;

	private Produto produto;
	private Categoria categoriaPai;

	private List<Categoria> categoriasRaizes;
	private List<Categoria> subcategorias;

	public ProdutoSource() {
		limpar();
	}

	public void inicializar() {

		if (this.produto == null) {
			limpar();
		}

//		categoriasRaizes = categorias.raizes();
//
//		if (this.categoriaPai != null) {
//			carregarSubcategorias();
//		}
	}

//	public void carregarSubcategorias() {
//		subcategorias = categorias.subcategoriasDe(categoriaPai);
//	}

	private void limpar() {
		produto = new Produto();
		categoriaPai = null;
		subcategorias = new ArrayList<>();
	}

	@PostMapping
	public Produto save(@Valid @RequestBody Produto produto) {
		return produtoService.save(produto);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto findById(@PathVariable("id") Long id) {
		return produtoService.findById(id);
	}
	
	
	public boolean isEditando() {
		return this.produto.getId() != null;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;

		if (produto != null) {
			this.categoriaPai = this.produto.getCategoria().getCategoriaPai();
		}
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

	@NotNull
	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

	public List<Categoria> getSubcategorias() {
		return subcategorias;
	}

}
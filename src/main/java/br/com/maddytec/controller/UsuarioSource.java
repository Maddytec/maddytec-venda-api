package br.com.maddytec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Usuario;
import br.com.maddytec.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioSource {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@PutMapping
	public Usuario save(@Valid @RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> findAll() {
		return usuarioService.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario findById(@Valid @PathVariable("id") Long id) {
		return usuarioService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFindById(@PathVariable Long id) {
		usuarioService.deleteFindById(id);
	}
	
}

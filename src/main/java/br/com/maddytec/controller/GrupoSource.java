package br.com.maddytec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.model.Grupo;
import br.com.maddytec.service.GrupoService;

@RestController
@RequestMapping("/grupo")
public class GrupoSource {
	
	@Autowired
	private GrupoService grupoService;
	
	@PostMapping
	public Grupo save(@Valid @RequestBody Grupo grupo) {
		return grupoService.save(grupo);
	}
	
	
	@GetMapping("/{id}")
	public Grupo findById(@PathVariable("id") Long id) {
		return grupoService.findById(id);
	}
	
	@GetMapping
	public List<Grupo> findAll(){
		return grupoService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		grupoService.deleteById(id);
	}
}

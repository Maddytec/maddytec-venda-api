package br.com.maddytec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Grupo;
import br.com.maddytec.repository.Grupos;

@Service
public class GrupoService {

	@Autowired
	private Grupos grupos;
	
	
	public Grupo save(Grupo grupo) {
		return grupos.save(grupo);
	}
	
	public Grupo findById(Long id) {
		return grupos.findById(id).get();
	}
	
	public List<Grupo> findAll(){
		return grupos.findAll();
	}
	
	public void deleteById(Long id) {
		grupos.deleteById(id);
	}
	
	public void delete(Grupo grupo) {
		grupos.delete(grupo);
	}
}

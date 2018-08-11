package br.com.maddytec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Usuario;
import br.com.maddytec.repository.Usuarios;

@Service 
public class UsuarioService {

	@Autowired
	private Usuarios usuarios;
	
	public Usuario save(Usuario usuario) {
		return usuarios.save(usuario);
	}
	
	public List<Usuario> findAll() {
		return usuarios.findAll();    
	}
	
	public Usuario findById(Long id) {
		return usuarios.findById(id).get();
	}
	
	public void deleteFindById(Long id) {
		usuarios.deleteById(id);
	}
}

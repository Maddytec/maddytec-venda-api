package br.com.maddytec.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maddytec.model.Produto;
import br.com.maddytec.repository.Produtos;

@Service
public class ProdutoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private Produtos produtos;

	public Produto save(Produto produto) {
//		Produto produtoExistente = produtos.porSku(produto.getSku());
//
//		if (produtoExistente != null && !produtoExistente.equals(produto)) {
//			throw new NegocioException("Já existe produto com o SKU informado.");
//		}

		return produtos.save(produto);

	}

	public List<Produto> findAll(){
		return produtos.findAll();
	}
	
	public Produto findById(Long id) {
		return produtos.findById(id).get();
	}

}

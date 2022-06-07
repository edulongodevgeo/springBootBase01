package com.teste.primeiroexemplo.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;
import com.teste.primeiroexemplo.repository.ProdutoRepository_old;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	//a partir daqui, retorna todos os métodos do ProdutoRepository.
	public List<Produto> obterTodos(){
		//Caso houvesse alguma regra de negócio, colocaria-se aqui...
		return produtoRepository.findAll();
	}
	
	//Método que retorna o produto encontrado pelo seu id.
	public Optional<Produto> obterPorId(Integer id) {
		//Pode na refatoração colocar um if aqui pra lançar uma exceção se o ID foir null/vazio.
		return produtoRepository.findById(id);
	}
	
	//Método para adicionar produto na lista.
	public Produto adicionar(Produto produto) {
		//Poderia ter alguma regra adicional para validar o produto...
		return produtoRepository.save(produto);
	}
	
	//Método para deletar o produto por id.
	public void deletar(Integer id) {
		produtoRepository.deleteById(id); // Obs.: QUANDO É VOID, NÃO TEM RETURN, PASSA DIRETO...
	}
	
	//Método para atualizar o produto na lista.
	public Produto atualizar(Integer id, Produto produto) {
		//Daria pra pensar em alguma validação no ID.
		produto.setId(id);
		
		return produtoRepository.save(produto);
	}
	
	
}

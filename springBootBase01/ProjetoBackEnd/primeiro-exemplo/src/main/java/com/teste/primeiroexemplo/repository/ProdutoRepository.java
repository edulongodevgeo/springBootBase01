package com.teste.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.model.exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository {

	//Simulando o banco de dados...
	private List<Produto> produtos = new ArrayList<Produto>();
	private Long ultimoId = (long) 0; //se der problema, mudar pra Integer.
	
	//Criar métodos
	
	//Método que retorna uma lista de produtos.
	public List<Produto> obterTodos() {
		return produtos;
	}
	
	//Método que retorna o produto encontrado pelo seu id.
	public Optional<Produto> obterPorId(Long id) {
		return produtos
				.stream()
				.filter(produto -> produto.getId() == id)
				.findFirst();	
	}
	
	//Método para adicionar produto na lista.
	public Produto adicionar(Produto produto) {
		
		ultimoId = ultimoId + 1; //ultimoId++
		produto.setId(ultimoId);
		produtos.add(produto);
		
		return produto;
	}
	
	//Método para deletar o produto por id.
	public void deletar(Long id) {
		produtos.removeIf(produto -> produto.getId() == id); // expressão lambda.
	}
	
	//Método para atualizar o produto na lista.
	public Produto atualizar(Produto produto) {
		
		//Encontrar um produto na lista
		Optional<Produto> produtoEncontrado = obterPorId(produto.getId());
		
		if(produtoEncontrado.isEmpty()) {
			throw new ResourceNotFoundException("Produto não localizado por Id.");
		}
		//Remover o produto antigo da lista.
		deletar(produto.getId());
		
		//depois adicionar um novo produto (no lugar dele).
		produtos.add(produto); // Não posso add o método "adicionar(produto)" direto pois ele iria incrementar ++
		
		return produto;
	}
}

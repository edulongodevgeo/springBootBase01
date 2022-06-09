package com.teste.primeiroexemplo.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Client;
import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ClientRepository;
import com.teste.primeiroexemplo.repository.ProdutoRepository;
import com.teste.primeiroexemplo.repository.ProdutoRepository_old;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	//a partir daqui, retorna todos os métodos do ProdutoRepository.
	/*public List<Client> obterTodos(){
		//Caso houvesse alguma regra de negócio, colocaria-se aqui...
		return clientRepository.findAll();
	}*/
	
	//Método que retorna o produto encontrado pelo seu id.
	/*public Optional<Client> obterPorId(Integer id) {
		//Pode na refatoração colocar um if aqui pra lançar uma exceção se o ID foir null/vazio.
		return clientRepository.findById(id);
	}*/
	
	//Método para adicionar produto na lista.
	/*public Client adicionar(Client client) {
		//Poderia ter alguma regra adicional para validar o produto...
		return clientRepository.save(client);
	}*/
	
	//Método para deletar o produto por id.
	/*public void deletar(Integer id) {
		clientRepository.deleteById(id); // Obs.: QUANDO É VOID, NÃO TEM RETURN, PASSA DIRETO...
	}*/
	
	//Método para atualizar o produto na lista.
	/*public Client atualizar(Integer id, Client client) {
		//Daria pra pensar em alguma validação no ID.
		client.setId(id);
		
		return clientRepository.save(client);
	}*/

	public List<Client> obterTodosClientes() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	public Optional<Client> obterPorIdCliente(Integer id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}

	public Client adicionarCliente(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	public void deletarCliente(Integer id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id); // Obs.: QUANDO É VOID, NÃO TEM RETURN, PASSA DIRETO...
	}

	public Client atualizarCliente(Integer id, Client client) {
		// TODO Auto-generated method stub
		client.setId(id);
		
		return clientRepository.save(client);	
	}
	
}

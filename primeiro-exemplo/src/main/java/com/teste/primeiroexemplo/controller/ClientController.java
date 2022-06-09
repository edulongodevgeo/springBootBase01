package com.teste.primeiroexemplo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.primeiroexemplo.model.Client;
import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.services.ClientService;
import com.teste.primeiroexemplo.services.ProdutoService;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public List<Client> obterTodos(){
		return clientService.obterTodosClientes();
	}
	
	@GetMapping("/{id}")
	public Optional<Client> obterPorId(@PathVariable Integer id){
		return clientService.obterPorIdCliente(id);
	}
	
	@PostMapping
	public Client adicionar(@RequestBody Client client) {
		return clientService.adicionarCliente(client);
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Integer id) {
		clientService.deletarCliente(id);
		return "produto com o id: " + id + " foi deletado com sucesso!";
	}
	
	@PutMapping("/{id}")
	public Client atualizar(@RequestBody Client client, @PathVariable Integer id) {
		return clientService.atualizarCliente(id, client);
	}
}

package com.teste.primeiroexemplo.model.erro;

public class ErrorMessage {
	private String tituloDoErro;
	private Integer statusDoErro;
	private String mensagem;
		
	public ErrorMessage(String tituloDoErro, Integer statusDoErro, String mensagem) {
		//super();
		this.tituloDoErro = tituloDoErro;
		this.statusDoErro = statusDoErro;
		this.mensagem = mensagem;
	}
	
	public String getTituloDoErro() {
		return tituloDoErro;
	}
	public void setTituloDoErro(String tituloDoErro) {
		this.tituloDoErro = tituloDoErro;
	}
	public Integer getStatusDoErro() {
		return statusDoErro;
	}
	public void setStatusDoErro(Integer statusDoErro) {
		this.statusDoErro = statusDoErro;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}

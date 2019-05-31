package com.algaworks.brewer.model;

import javax.validation.constraints.NotBlank;

public class Cliente {
	
	@NotBlank(message = "CPF é obrigatório")
	private String cpf_cnpj;	
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	private int tipo;
	
	private int telefone;
	
	private String email;
	
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String estado;
	private String cidade;
	
	
	public String getCpf() {
		return cpf_cnpj;
	}
	public void setCpf(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

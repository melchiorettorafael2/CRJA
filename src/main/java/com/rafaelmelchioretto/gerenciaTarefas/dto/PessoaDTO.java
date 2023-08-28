package com.rafaelmelchioretto.gerenciaTarefas.dto;

import java.io.Serializable;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;

public class PessoaDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	private String id;
	private String nome;
	private String idDepartamento;
	
	public PessoaDTO() {
		
	}
	
	public PessoaDTO(Pessoa obj) {
		
		id = obj.getId();
		nome = obj.getNome();
		idDepartamento = obj.getIdDepartamento();
			
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	
	
}

package com.rafaelmelchioretto.gerenciaTarefas.domain;

import java.io.Serializable;

public class Pessoa  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private int idDepartamento;

	public Pessoa() {
		
	}

	public Pessoa(int id, String nome, int idDepartamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.idDepartamento = idDepartamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + idDepartamento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		if (idDepartamento != other.idDepartamento)
			return false;
		return true;
	}
	
	
}

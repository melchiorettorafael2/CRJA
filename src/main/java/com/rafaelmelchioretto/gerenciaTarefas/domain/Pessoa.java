package com.rafaelmelchioretto.gerenciaTarefas.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Pessoa  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String idDepartamento;

	public Pessoa() {
		
	}

	public Pessoa(String id, String nome, String idDepartamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.idDepartamento = idDepartamento;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

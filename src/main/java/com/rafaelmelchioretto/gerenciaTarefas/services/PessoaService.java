package com.rafaelmelchioretto.gerenciaTarefas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;
import com.rafaelmelchioretto.gerenciaTarefas.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findaAll() {
		return repo.findAll();
	}
}

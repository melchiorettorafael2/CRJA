package com.rafaelmelchioretto.gerenciaTarefas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;
import com.rafaelmelchioretto.gerenciaTarefas.repository.PessoaRepository;
import com.rafaelmelchioretto.gerenciaTarefas.services.exception.ObjectNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findaAll() {
		return repo.findAll();
	}
	
	public Pessoa findById(String id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}

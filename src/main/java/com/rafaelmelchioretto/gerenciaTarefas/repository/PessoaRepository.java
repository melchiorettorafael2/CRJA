package com.rafaelmelchioretto.gerenciaTarefas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa,String>{
	
}

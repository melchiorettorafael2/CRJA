package com.rafaelmelchioretto.gerenciaTarefas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;
import com.rafaelmelchioretto.gerenciaTarefas.repository.PessoaRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		pessoaRepository.deleteAll();
		
		Pessoa camila = new Pessoa(null,"Camila","1");
		Pessoa pedro = new Pessoa(null,"Pedro","2");
		Pessoa fabiano = new Pessoa(null,"Fabiano","3");
		Pessoa raquel = new Pessoa(null,"Raquel","3");
		Pessoa patricia = new Pessoa(null,"Patricia","3");
		Pessoa joaquim = new Pessoa(null,"Joaquim","1");
		
		pessoaRepository.saveAll(Arrays.asList(camila,pedro,fabiano,raquel,patricia,joaquim));

		
	}

}

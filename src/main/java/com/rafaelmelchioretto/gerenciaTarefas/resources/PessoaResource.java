package com.rafaelmelchioretto.gerenciaTarefas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;
import com.rafaelmelchioretto.gerenciaTarefas.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
	
		List<Pessoa> list = service.findaAll();
		return ResponseEntity.ok().body(list);
		
	}
}

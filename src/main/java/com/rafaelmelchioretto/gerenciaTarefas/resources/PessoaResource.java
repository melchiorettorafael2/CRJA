package com.rafaelmelchioretto.gerenciaTarefas.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;
import com.rafaelmelchioretto.gerenciaTarefas.dto.PessoaDTO;
import com.rafaelmelchioretto.gerenciaTarefas.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> findAll(){
	
		List<Pessoa> list = service.findaAll();
		List<PessoaDTO> listDto = list.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<PessoaDTO> findById(@PathVariable String id){
		Pessoa obj = service.findById(id);
		return ResponseEntity.ok().body(new PessoaDTO(obj));
		
	}
}

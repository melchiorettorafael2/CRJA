package com.rafaelmelchioretto.gerenciaTarefas.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelmelchioretto.gerenciaTarefas.domain.Pessoa;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
		Pessoa Camila = new Pessoa(1, "Camila", 1);
		Pessoa Pedro = new Pessoa(2, "Pedro", 2);
		Pessoa Fabiano = new Pessoa(3, "Fabiano", 3);
		Pessoa Raquel = new Pessoa(4, "Raquel", 3);
		Pessoa Patricia = new Pessoa(5, "Patricia", 3);
		Pessoa Joaquim = new Pessoa(6, "Joaquim", 1);
		
		List<Pessoa> list = new ArrayList<>();
		list.addAll(Arrays.asList(Camila,Pedro,Fabiano,Raquel,Patricia,Joaquim));
		return ResponseEntity.ok().body(list);
		
	}
}

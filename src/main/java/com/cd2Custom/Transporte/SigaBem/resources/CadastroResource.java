package com.cd2Custom.Transporte.SigaBem.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd2Custom.Transporte.SigaBem.entities.Cadastro;

@RestController
@RequestMapping(value = "/cadastros")
public class CadastroResource {
	
	@GetMapping
	public ResponseEntity<List<Cadastro>> findAll(){
		List<Cadastro> list = new ArrayList<>();
		list.add(new Cadastro(1L, 33.0, "52030150", "52030140", "Lucca Lima", 33.0, Instant.now(), Instant.now()));
		list.add(new Cadastro(2L, 55.0, "51030150", "50030120", "Lolo Lima", 55.0, Instant.now(), Instant.now()));
		return ResponseEntity.ok().body(list);
		
	}
	
	

}

package com.bootcampspring.crudUser.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcampspring.crudUser.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Bruno", "364.014.798-76", 6.000, 2));
		list.add(new Client(2L, "Elisa", "256.697.526-85", 5.500, 2));
		
		return ResponseEntity.ok().body(list);
	}
	

}

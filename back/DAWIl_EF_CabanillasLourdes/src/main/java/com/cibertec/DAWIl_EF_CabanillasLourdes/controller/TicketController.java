package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.TicketEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.StatusService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TicketController {
	
	@Autowired
	TicketService service;

	@GetMapping
	public ResponseEntity<List<TicketEntity>> list(){
		return  new ResponseEntity<>(service.listar(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<TicketEntity> add(@RequestBody TicketEntity c) {
		return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<TicketEntity> update(@RequestBody TicketEntity c) {
		return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

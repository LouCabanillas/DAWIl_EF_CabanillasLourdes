package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.PriorityEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.KindService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityController {
	
	@Autowired
	PriorityService service;

	@GetMapping
	public ResponseEntity<List<PriorityEntity>> list(){
		return  new ResponseEntity<>(service.listar(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<PriorityEntity> add(@RequestBody PriorityEntity c) {
		return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<PriorityEntity> update(@RequestBody PriorityEntity c) {
		return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

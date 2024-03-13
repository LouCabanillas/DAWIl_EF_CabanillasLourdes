package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.KindEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kind")
public class KindController {
	
	@Autowired
	KindService service;

	@GetMapping
	public ResponseEntity<List<KindEntity>> list(){
		return  new ResponseEntity<>(service.listar(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<KindEntity> add(@RequestBody KindEntity c) {
		return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<KindEntity> update(@RequestBody KindEntity c) {
		return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

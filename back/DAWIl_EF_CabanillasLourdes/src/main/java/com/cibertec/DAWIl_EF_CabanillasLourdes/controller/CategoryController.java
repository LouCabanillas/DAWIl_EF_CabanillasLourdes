package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.CategoryEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;

	@GetMapping
	public ResponseEntity<List<CategoryEntity>> list(){
		return  new ResponseEntity<>(service.listar(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<CategoryEntity> add(@RequestBody CategoryEntity c) {
		return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<CategoryEntity> update(@RequestBody CategoryEntity c) {
		return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

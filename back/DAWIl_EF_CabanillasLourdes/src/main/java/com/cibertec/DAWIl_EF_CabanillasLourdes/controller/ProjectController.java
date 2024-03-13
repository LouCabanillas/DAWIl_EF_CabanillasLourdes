package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.ProjectEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.PriorityService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService service;

	@GetMapping
	public ResponseEntity<List<ProjectEntity>> list(){
		return  new ResponseEntity<>(service.listar(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<ProjectEntity> add(@RequestBody ProjectEntity c) {
		return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<ProjectEntity> update(@RequestBody ProjectEntity c) {
		return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

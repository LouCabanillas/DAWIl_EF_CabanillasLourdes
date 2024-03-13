package com.cibertec.DAWIl_EF_CabanillasLourdes.controller;

import com.cibertec.DAWIl_EF_CabanillasLourdes.entity.UserEntity;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.TicketService;
import com.cibertec.DAWIl_EF_CabanillasLourdes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {
	
	@Autowired
	UserService service;

	@GetMapping
	public List<UserEntity> list(){
		return service.listar();
	}
	
	@PostMapping
	public UserEntity add(@RequestBody UserEntity c) {
		return service.add(c);
	}
	
	@PutMapping
	public UserEntity update(@RequestBody UserEntity c) {
		return service.update(c);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@GetMapping("/{id}")
	public UserEntity search(@PathVariable("id") Long id) {
		return service.search(id);
	}

}

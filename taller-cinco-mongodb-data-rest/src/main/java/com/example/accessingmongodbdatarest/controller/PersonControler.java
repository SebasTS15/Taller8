package com.example.accessingmongodbdatarest.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingmongodbdatarest.document.Person;
import com.example.accessingmongodbdatarest.service.PersonService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping ("/api/person")
public class PersonControler {

	@Autowired
	PersonService service;
	
	@PostMapping
	public ResponseEntity<Person> crear(@RequestBody Person person){
		
		if(person.getCreateAt()==null) {
			person.setCreateAt(new Date());
		}
		Person personBd = service.save(person);
		
		
		return ResponseEntity.ok(personBd);
		
	}

	@PutMapping
	public ResponseEntity<Person> updateCellNUmber(@RequestBody Person person){
		return ResponseEntity.ok(service.updateCellNumber(person));	
	}
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll(){
		List<Person> person = service.findAll();
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
	
	@GetMapping("/AllUpperCase")
	public ResponseEntity<List<Person>> findAllConNombreUpperCase(){
		List<Person> person = service.findAllConNombreUpperCase();
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
	@GetMapping("/AllUpperCaseRepeat")
	public ResponseEntity<List<Person>> findAllConNombreUpperCaseRepeat(){
		List<Person> person = service.findAllConNombreUpperCase();
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Person>findById(@RequestParam String param) {
		Person person = service.findById(param);
		if (person != null) {
			return new ResponseEntity<>(person,HttpStatus.ACCEPTED);			
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping
	public ResponseEntity<Person> delete(@RequestBody Person person){
		boolean per = service.delete(person);
		if (per == true){
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/Address")
	public ResponseEntity<Person> updateAddress(@RequestBody Person person){
		return ResponseEntity.ok(service.updateAddress(person));	
	}
	
	@PutMapping("/Email")
	public ResponseEntity<Person> updateEmailAddress(@RequestBody Person person){
		return ResponseEntity.ok(service.updateEmailAddress(person));	
	}
	
}

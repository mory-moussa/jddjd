package com.telemedine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telemedecine.services.RendezVousService;
import com.telemedine.models.RendezVous;
 

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/rendezvous")
public class RendezVousController {

	
	
	@Autowired
	RendezVousService rendezVousService;

	@PostMapping("/create") 
	public ResponseEntity<RendezVous> createProduit(@RequestBody RendezVous rendezVous) {
		rendezVousService.save(rendezVous);
	    return new ResponseEntity<RendezVous>(rendezVous,HttpStatus.OK);  
	}
	 
	@GetMapping("/details/{id}") 
	public ResponseEntity<RendezVous> getProduit(@PathVariable Long id) { 
		RendezVous rendezVous =rendezVousService.findById(id) ;
	        return new ResponseEntity<RendezVous>(rendezVous,HttpStatus.OK) ;
	} 
	
 	@PutMapping("/update")
 	public ResponseEntity updateProduit(@RequestBody RendezVous rendezVous) {
 		rendezVousService.save(rendezVous);
 	    return new ResponseEntity(HttpStatus.OK);
 	} 
 	
	
 	@DeleteMapping("/delete/{id}")
 	public ResponseEntity deleteProduit(@PathVariable Long id) {
 		rendezVousService.delete(id);
 	    return new ResponseEntity(HttpStatus.OK);
 	}
}

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

import com.telemedecine.services.PrixConsultationService;
import com.telemedine.models.PrixConsultation;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prixConsultation")
public class PrixConsultationController {
	
	@Autowired
	PrixConsultationService prixConsultationService;

	@PostMapping("/create") 
	public ResponseEntity<PrixConsultation> createProduit(@RequestBody PrixConsultation prixConsultation) {
		prixConsultationService.save(prixConsultation);
	    return new ResponseEntity<PrixConsultation>(prixConsultation,HttpStatus.OK);  
	}
	 
	@GetMapping("/details/{id}") 
	public ResponseEntity<PrixConsultation> getProduit(@PathVariable Long id) { 
		PrixConsultation prixConsultation =prixConsultationService.findById(id) ;
	        return new ResponseEntity<PrixConsultation>(prixConsultation,HttpStatus.OK) ;
	} 
	
 	@PutMapping("/update")
 	public ResponseEntity updateProduit(@RequestBody PrixConsultation prixConsultation) {
 		prixConsultationService.save(prixConsultation);
 	    return new ResponseEntity(HttpStatus.OK);
 	} 
 	
	
 	@DeleteMapping("/delete/{id}")
 	public ResponseEntity deleteProduit(@PathVariable Long id) {
 		prixConsultationService.delete(id);
 	    return new ResponseEntity(HttpStatus.OK);
 	}

}

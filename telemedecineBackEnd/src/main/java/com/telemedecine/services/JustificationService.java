package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.telemedine.models.Justification;
import com.telemedine.repository.JustificationRepository;
 
public class JustificationService {

	
 	@Autowired
 	JustificationRepository justificationRepository; 
 	
 	public List<Justification> findAll() { 
		return justificationRepository.findAll();
	} 
 	 
 	public Justification save(Justification justification) {
 		justificationRepository.save(justification);
		return justification;
	} 
 	
 	public Justification findById(long id) {
		if(justificationRepository.findById(id).isPresent()) {
			return justificationRepository.findById(id).get();
		}
		return null;
	} 
 	public void delete(long id) {
 		justificationRepository.deleteById(id);		
	}
 	
}

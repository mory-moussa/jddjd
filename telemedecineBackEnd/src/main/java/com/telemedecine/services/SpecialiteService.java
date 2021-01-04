package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.telemedine.models.Specialite;
import com.telemedine.repository.SpecialiteRepository;

public class SpecialiteService {
	
 	@Autowired
 	SpecialiteRepository specialiteRepository; 
 	
 	public List<Specialite> findAll() { 
		return specialiteRepository.findAll();
	} 
 	 
 	public Specialite save(Specialite specialite) {
 		specialiteRepository.save(specialite);
		return specialite;
	} 
 	
 	public Specialite findById(long id) {
		if(specialiteRepository.findById(id).isPresent()) {
			return specialiteRepository.findById(id).get();
		}
		return null;
	} 
 	public void delete(long id) {
 		specialiteRepository.deleteById(id);		
	}

}

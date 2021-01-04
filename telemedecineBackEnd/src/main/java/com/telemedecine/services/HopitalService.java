package com.telemedecine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telemedine.models.Hopital;
import com.telemedine.repository.HopitalRepository;
@Service
public class HopitalService {

 	@Autowired
 	HopitalRepository hopitalRepository; 
 	
 	public List<Hopital> findAll() { 
		return hopitalRepository.findAll();
	}

 	public Hopital save(Hopital hopital) {
 		hopitalRepository.save(hopital);
		return hopital;
	}

 	public Hopital findById(long id) {
		if(hopitalRepository.findById(id).isPresent()) {
			return hopitalRepository.findById(id).get();
		}
		return null;
	}
 	
 	//TODO check if working
 	public Hopital findByName(String name) {
		if(hopitalRepository.findByName(name).isPresent()) {
			return hopitalRepository.findByName(name).get();
		}
		return null;
	}
 	
 	public Optional<Hopital> findifContainName(String name) { 
			return hopitalRepository.findIfContainName(name) ;  
	}
 	
 	
 	public void delete(long id) {
 		hopitalRepository.deleteById(id);		
	}
}

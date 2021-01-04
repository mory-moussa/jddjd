package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.telemedine.models.Adresse;
import com.telemedine.repository.AdresseRepository;
 
public class AdresseService {
	
	
 	@Autowired
 	AdresseRepository adresseRepository; 
 	
 	public List<Adresse> findAll() { 
		return adresseRepository.findAll();
	}

 	public Adresse save(Adresse adresse) {
 		adresseRepository.save(adresse);
		return adresse;
	}

 	public Adresse findById(long id) {
		if(adresseRepository.findById(id).isPresent()) {
			return adresseRepository.findById(id).get();
		}
		return null;
	}

 	public void delete(long id) {
 		adresseRepository.deleteById(id);		
	}


}

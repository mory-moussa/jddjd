package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telemedine.models.RendezVous;
import com.telemedine.repository.RendezVousRepository;

  
@Service 
public class RendezVousService {

	
 	@Autowired
 	RendezVousRepository RenezVousRepository; 
 	
 	public List<RendezVous> findAll() { 
		return RenezVousRepository.findAll();
	}

 	public RendezVous save(RendezVous rendezVous) {
		RenezVousRepository.save(rendezVous);
		return rendezVous;
	}

 	public RendezVous findById(long id) {
		if(RenezVousRepository.findById(id).isPresent()) {
			return RenezVousRepository.findById(id).get();
		}
		return null;
	}

 	public void delete(long id) {
		RenezVousRepository.deleteById(id);		
	}

 
 
	
 	
}

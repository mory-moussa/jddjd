package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telemedine.models.Justification;
import com.telemedine.models.PrixConsultation;
import com.telemedine.repository.JustificationRepository;
import com.telemedine.repository.PrixConsultationRepository;

@Service
public class PrixConsultationService {
	
	@Autowired
	PrixConsultationRepository prixConsultationRepository; 
 	
 	public List<PrixConsultation> findAll() { 
		return prixConsultationRepository.findAll();
	} 
 	 
 	public PrixConsultation save(PrixConsultation prixConsultation) {
 		prixConsultationRepository.save(prixConsultation);
		return prixConsultation;
	} 
 	
 	public PrixConsultation findById(long id) {
		if(prixConsultationRepository.findById(id).isPresent()) {
			return prixConsultationRepository.findById(id).get();
		}
		return null;
	} 
 	
 	public void delete(long id) {
 		prixConsultationRepository.deleteById(id);		
	}
 	

}

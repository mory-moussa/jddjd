package com.telemedecine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telemedine.models.FeedBack;
import com.telemedine.repository.FeedBackRepository;

@Service  
public class FeedBackService {
	
 	@Autowired
 	FeedBackRepository feedBackRepository; 
 	
 	public List<FeedBack> findAll() { 
		return feedBackRepository.findAll();
	} 
 	
 	public List<FeedBack> findAllDoctorFeedBack(Long idMedecin) { 
		return feedBackRepository.findAllDoctorFeedBack(idMedecin);
	} 

 	public FeedBack save(FeedBack feedBack) {
 		feedBackRepository.save(feedBack);
		return feedBack;
	} 
 	
 	public FeedBack findById(long id) {
		if(feedBackRepository.findById(id).isPresent()) {
			return feedBackRepository.findById(id).get();
		}
		return null;
	} 
 	public void delete(long id) {
 		feedBackRepository.deleteById(id);		
	}

}

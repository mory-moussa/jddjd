package com.telemedine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
import com.telemedine.models.PrixConsultation;

 
@Repository
public interface PrixConsultationRepository extends JpaRepository<PrixConsultation, Long>{

}
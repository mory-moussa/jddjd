package com.telemedine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telemedine.models.FeedBack;
 

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {
	 
	@Query("from FeedBack where idMedecin = :idMedecin ")
	List<FeedBack> findAllDoctorFeedBack(@Param("idMedecin") Long idMedecin);
}

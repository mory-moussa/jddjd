package com.telemedine.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
public class PrixConsultation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;

	@NotNull
	private Long idSpecialite; 
	
	@NotNull
	private Long idMedecin;
	
	@NotNull
	private double prixConsultation;

	
}

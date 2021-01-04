package com.telemedine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telemedine.models.Adresse;
import com.telemedine.models.Hopital;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long>{

}

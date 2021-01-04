package com.telemedine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telemedine.models.Hopital;
import com.telemedine.models.Specialite;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Long>{

}

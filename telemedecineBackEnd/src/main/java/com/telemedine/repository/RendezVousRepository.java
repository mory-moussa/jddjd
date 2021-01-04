package com.telemedine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.telemedine.models.RendezVous;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long>{

}

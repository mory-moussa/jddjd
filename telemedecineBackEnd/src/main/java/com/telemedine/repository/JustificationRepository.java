package com.telemedine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telemedine.models.Justification;

@Repository
public interface JustificationRepository extends JpaRepository<Justification, Long>{

}

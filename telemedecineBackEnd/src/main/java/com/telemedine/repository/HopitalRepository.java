package com.telemedine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telemedine.models.FeedBack;
import com.telemedine.models.Hopital;
import com.telemedine.models.User;
@Repository
public interface HopitalRepository extends JpaRepository<Hopital, Long> {

	Optional<Hopital> findByName(String name);

	@Query("from Hopital where name like : keyword")
 	Optional<Hopital> findIfContainName(@Param("name") String name); //TODO check if working properly or not

}

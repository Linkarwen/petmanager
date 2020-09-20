package com.pettool.petmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pettool.petmanager.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}
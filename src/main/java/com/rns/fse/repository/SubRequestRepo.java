package com.rns.fse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rns.fse.entities.SubRequest;

@Repository
public interface SubRequestRepo extends JpaRepository<SubRequest,Integer> {

	List<SubRequest> findAll();
}

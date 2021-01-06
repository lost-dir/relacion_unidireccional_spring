package com.relacion.unidireccional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relacion.unidireccional.model.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info, Integer> {

}

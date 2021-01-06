package com.relacion.unidireccional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relacion.unidireccional.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

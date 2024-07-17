package com.weiminglai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weiminglai.app.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
	
}

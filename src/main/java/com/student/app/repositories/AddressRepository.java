package com.student.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.app.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
}

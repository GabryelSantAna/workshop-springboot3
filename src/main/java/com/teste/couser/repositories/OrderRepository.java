package com.teste.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.couser.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}

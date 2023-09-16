package com.teste.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.couser.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

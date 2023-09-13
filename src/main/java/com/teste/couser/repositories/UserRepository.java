package com.teste.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.couser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

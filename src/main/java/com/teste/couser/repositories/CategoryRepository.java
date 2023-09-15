package com.teste.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.couser.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package com.manolo.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manolo.inventario.entity.FoodEntity;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer>{

}

package com.manolo.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manolo.inventario.entity.MyListFoodEntity;

@Repository
public interface MyFoodRepository extends JpaRepository<MyListFoodEntity, Integer>{

}

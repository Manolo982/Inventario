package com.manolo.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manolo.inventario.entity.FoodEntity;
import com.manolo.inventario.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public void save(FoodEntity food) {
		foodRepository.save(food);
    }

    public List<FoodEntity> getAllFoods() {
        return foodRepository.findAll();
    }

    public FoodEntity getFoodById(int id) {
        return foodRepository.findById(id).get();
    }

    public void deleteById(int id) {
    	foodRepository.deleteById(id);
    }
	
}

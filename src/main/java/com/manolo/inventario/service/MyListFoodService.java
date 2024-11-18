package com.manolo.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manolo.inventario.entity.MyListFoodEntity;
import com.manolo.inventario.repository.MyFoodRepository;

@Service
public class MyListFoodService {

	@Autowired
	private MyFoodRepository myFoodRepository;
	
	public void saveMyFoods(MyListFoodEntity book) {
		myFoodRepository.save(book);
    }

    public List<MyListFoodEntity> getAllMyFoods() {
        return myFoodRepository.findAll();
    }

    public void deleteById(int id) {
    	myFoodRepository.deleteById(id);
    }
	
}

package com.manolo.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manolo.inventario.service.MyListFoodService;

@Controller
public class MyListFoodController {

	@Autowired
	private MyListFoodService myListFoodService;
	
	@RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {

		myListFoodService.deleteById(id);
        return "redirect:/my_foods";
    }
	
	
}

package com.manolo.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manolo.inventario.entity.FoodEntity;
import com.manolo.inventario.entity.MyListFoodEntity;
import com.manolo.inventario.service.FoodService;
import com.manolo.inventario.service.MyListFoodService;

@Controller
public class FoodController {

	@Autowired
    private FoodService foodService;
    @Autowired
    private MyListFoodService myListFoodService;
	
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/food_register")
    public String foodRegister() {
        return "foodRegister";
    }
    
    @GetMapping("/available_foods")
    public ModelAndView getAllsFoods() {
        List<FoodEntity> list = foodService.getAllFoods();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("foodList");
        modelAndView.addObject("food", list);
        return modelAndView;
    }

    @GetMapping("/cards_food")
    public String getCardsFoods(Model model){
        List<FoodEntity> list = foodService.getAllFoods();
        model.addAttribute("food",list);
        return "foodCard";
    }

    @PostMapping("/save")
    public String addFood(@ModelAttribute FoodEntity food) {
    	foodService.save(food);
        return "redirect:/available_foods";
    }

    @GetMapping("/my_foods")
    public String getMyFoods(Model model) {
        List<MyListFoodEntity> list = myListFoodService.getAllMyFoods();
        model.addAttribute("food", list);
        return "myFoods";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
    	FoodEntity food = foodService.getFoodById(id);
    	MyListFoodEntity bookListService = new MyListFoodEntity(food.getId(),
    			food.getName(),
        		food.getCode(),
                food.getInput(),
        		food.getExpired(),
        		food.getPrice());
    	myListFoodService.saveMyFoods(bookListService);
        return "redirect:/my_foods";
    }

    @RequestMapping("/editFood/{id}")
    public String editFood(@PathVariable("id") int id, Model model) {
    	FoodEntity food = foodService.getFoodById(id);
        model.addAttribute("food", food);
        return "foodEdit";
    }

    @RequestMapping("/deleteFood/{id}")
    public String deleteFood(@PathVariable("id") int id) {
    	foodService.deleteById(id);
        return "redirect:/available_foods";
    }
    
}

package com.omkar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.Exception.RestaurantException;
import com.omkar.model.Category;
import com.omkar.model.Restaurant;
import com.omkar.repository.CategoryRepository;

@Service
public class CategoryServiceImplementation implements CategoryService {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(String name,Long userId) throws RestaurantException {
		Restaurant restaurant=restaurantService.getRestaurantsByUserId(userId);
		Category createdCategory=new Category();
		
		createdCategory.setName(name);
		createdCategory.setRestaurant(restaurant);
		return categoryRepository.save(createdCategory);
	}

	@Override
	public List<Category> findCategoryByRestaurantId(Long id) throws RestaurantException {
		Restaurant restaurant=restaurantService.findRestaurantById(id);
		return categoryRepository.findByRestaurantId(id);
	}

	@Override
	public Category findCategoryById(Long id) throws RestaurantException {
		Optional<Category> opt=categoryRepository.findById(id);
		
		if(opt.isEmpty()) {
			throw new RestaurantException("category not exist with id "+id);
		}
		
		return opt.get();
	}

}
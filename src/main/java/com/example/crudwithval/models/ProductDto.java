package com.example.crudwithval.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	@NotEmpty(message="Name must be not empty")
	private String name;
	
	@NotEmpty(message="Brand must be not empty")
	private String brand;
	
	@NotEmpty(message="Category must be not empty")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 10, message = "The Description should be at least 10  character")
	@Size(max = 2000, message = " The Description should not exceed 2000 character")
	private String description;
	
	private MultipartFile imageFile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	
	

}

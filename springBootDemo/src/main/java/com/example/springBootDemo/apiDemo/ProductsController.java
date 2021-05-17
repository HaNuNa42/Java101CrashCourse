package com.example.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {

	@GetMapping("/")
	public String get() {
		return "laptop 4";
	}
}

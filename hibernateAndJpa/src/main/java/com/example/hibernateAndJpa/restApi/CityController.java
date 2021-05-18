package com.example.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.hibernateAndJpa.Business.ICityService;
import com.example.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api") //Domain ismini yazıyoruz. classın başına koymamızın nedeni. buradaki her şey api ile başlayacak diyoruz.
public class CityController {
	
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities") //veritabanında değişiklik yapılmayacaksa get mapping kullanılır. sadece data çekmek için
	public List<City> get() {
		return cityService.getAll();
	}
	
	@PostMapping("/add") //veritabanında değişiklik yapılacağı zaman post mapping kullanılır. 
	public void add(@RequestBody City city ) { //buradaki parametreyi yapılan isteğin body'sinden alacağımız için reguest body parametresini kullanırızz.
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city ) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city ) {
		cityService.delete(city);
	}
	
	@GetMapping("/cities/{id}") 
	public City getById(@PathVariable int id) {
		return cityService.getById(id);
	}
	
}

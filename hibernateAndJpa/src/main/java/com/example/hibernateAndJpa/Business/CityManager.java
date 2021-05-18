package com.example.hibernateAndJpa.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import com.example.hibernateAndJpa.DataAccess.ICityDal;
import com.example.hibernateAndJpa.Entities.City;

@Service //bunun bir iş katmanı olduğunu belirtiyoruz.
public class CityManager implements ICityService{
	
	
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		//business
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(int id) {
		
		return this.cityDal.getById(id);
	}

}

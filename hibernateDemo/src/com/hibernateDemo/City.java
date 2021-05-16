package com.hibernateDemo;

import javax.persistence.*;

@Entity //bir veritaban� nesenesi oldu�unu belirtiyoruz
@Table(name="city") //bunun bir tablo oldu�unu belirtiyoruz
public class City {
	
	@Id //id oldu�unu belirtiyoruz
	@Column(name="ID") //veritaban�nda hangi column'a kar��l�k gelece�ini belirtiyoruz. belirtmezsek bu �ekilde o zaman tan�mlad���m�z �ekilde arar ve ba�lant� veritaban� ile kuramaz.
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="countryCode")
	private String countryCode;
	
	@Column(name="district")
	private String district;
	
	@Column(name="population")
	private int population;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	

}

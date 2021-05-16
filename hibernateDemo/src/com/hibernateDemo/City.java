package com.hibernateDemo;

import javax.persistence.*;

@Entity //bir veritabaný nesenesi olduðunu belirtiyoruz
@Table(name="city") //bunun bir tablo olduðunu belirtiyoruz
public class City {
	
	@Id //id olduðunu belirtiyoruz
	@Column(name="ID") //veritabanýnda hangi column'a karþýlýk geleceðini belirtiyoruz. belirtmezsek bu þekilde o zaman tanýmladýðýmýz þekilde arar ve baðlantý veritabaný ile kuramaz.
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

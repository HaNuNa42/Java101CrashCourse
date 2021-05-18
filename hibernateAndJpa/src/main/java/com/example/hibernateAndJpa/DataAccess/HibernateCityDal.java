package com.example.hibernateAndJpa.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernateAndJpa.Entities.City;

//JPA
public class HibernateCityDal implements ICityDal {

	private EntityManager entityManager;

	@Autowired// gerekli olan injection.u gerçekleştirir. gerekli olan paketlere bakarak otomatik seçer
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional // bir transaction açıyoruz. yani kodumuz build olduğunda açma ve kapama kodları otomatik koyuyor. - AOP
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class); // session nesnesi istiyoruz.
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.save(city);

	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);

	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.delete(cityToDelete);

	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		City city = session.get(City.class, id);
		return city;
		
	}
	
	

}

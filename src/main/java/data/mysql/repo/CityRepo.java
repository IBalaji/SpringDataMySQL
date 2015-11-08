package data.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import data.mysql.model.City;

public interface CityRepo extends CrudRepository<City,Long> {
}

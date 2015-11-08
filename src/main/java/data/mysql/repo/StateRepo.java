package data.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import data.mysql.model.State;

public interface StateRepo extends CrudRepository<State,Long> {
}
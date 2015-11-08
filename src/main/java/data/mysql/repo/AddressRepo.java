package data.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import data.mysql.model.Address;

public interface AddressRepo extends CrudRepository<Address,Long> {

}

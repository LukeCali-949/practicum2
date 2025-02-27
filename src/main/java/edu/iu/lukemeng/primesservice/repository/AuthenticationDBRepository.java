package edu.iu.lukemeng.primesservice.repository;

import edu.iu.lukemeng.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository
        extends CrudRepository<Customer, String> {

    Customer findByUsername(String username);
}


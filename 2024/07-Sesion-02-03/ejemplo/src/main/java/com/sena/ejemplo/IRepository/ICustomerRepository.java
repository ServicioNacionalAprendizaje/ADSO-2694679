package com.sena.ejemplo.IRepository;

import com.sena.ejemplo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}

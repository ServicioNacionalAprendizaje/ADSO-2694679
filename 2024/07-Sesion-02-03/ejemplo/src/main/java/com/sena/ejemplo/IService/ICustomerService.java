package com.sena.ejemplo.IService;

import com.sena.ejemplo.Entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Customer save(Customer customer);
    void update(Customer customer, Long id);
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    void deleteById(Long id);
}

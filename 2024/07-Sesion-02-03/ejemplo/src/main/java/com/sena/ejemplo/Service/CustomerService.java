package com.sena.ejemplo.Service;

import com.sena.ejemplo.Entity.Customer;
import com.sena.ejemplo.IRepository.ICustomerRepository;
import com.sena.ejemplo.IService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository repository;

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void update(Customer customer, Long id) {
        //Verificar con el ID si el registro existe.
        Optional<Customer> op = repository.findById(id);

        if (op.isEmpty()) {
            System.out.printf("El cliente con el ID %d no existe", id);
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualiza
            Customer customerUpdate = op.get();
            customerUpdate.setName(customer.getName());
            customerUpdate.setEmail(customer.getEmail());
            customerUpdate.setPhone(customer.getPhone());
            customerUpdate.setAddress(customer.getAddress());

            repository.save(customerUpdate);
        }
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

package com.sena.servicesecurity.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.Entity.Person;

@Repository
public interface IPersonRepository extends IBaseRepository<Person, Long>{

}

package com.sena.servicesecurity.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.Entity.User;

@Repository
public interface IUserRepository extends IBaseRepository<User, Long>{

}

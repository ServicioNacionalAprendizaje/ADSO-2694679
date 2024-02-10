package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.User;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IUserRepository;
import com.sena.servicesecurity.IService.IUserService;

@Service
public class UserService extends ABaseService<User> implements IUserService{

	@Override
	protected IBaseRepository<User, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IUserRepository repository;

}

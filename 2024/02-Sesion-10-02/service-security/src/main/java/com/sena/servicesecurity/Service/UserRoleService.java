package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.UserRole;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IUserRoleRepository;
import com.sena.servicesecurity.IService.IUserRoleService;

@Service
public class UserRoleService extends ABaseService<UserRole> implements IUserRoleService{

	@Override
	protected IBaseRepository<UserRole, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IUserRoleRepository repository;

}

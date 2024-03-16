package com.sena.servicesecurity.Service.IService;

import java.util.Optional;

import com.sena.servicesecurity.DTO.IUserDto;
import com.sena.servicesecurity.Entity.User;

public interface IUserService extends IBaseService<User>{

	 Optional<IUserDto> getUserWithViews(String username, String password);
	 
	 

}

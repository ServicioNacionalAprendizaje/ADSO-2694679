package com.sena.servicesecurity.IService;

import java.util.Optional;

import com.sena.servicesecurity.DTO.IUserDto;
import com.sena.servicesecurity.Entity.User;

public interface IUserService extends IBaseService<User>{

	Optional<IUserDto> getLogin(String username, String password);
}

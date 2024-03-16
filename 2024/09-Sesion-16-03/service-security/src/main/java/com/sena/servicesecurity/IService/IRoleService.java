package com.sena.servicesecurity.IService;

import java.util.List;

import com.sena.servicesecurity.DTO.IRoleDto;
import com.sena.servicesecurity.Entity.Role;

public interface IRoleService extends IBaseService<Role>{

	List<IRoleDto> getList();
}

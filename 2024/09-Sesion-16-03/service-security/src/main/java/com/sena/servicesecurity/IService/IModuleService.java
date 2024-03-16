package com.sena.servicesecurity.IService;

import java.util.List;

import com.sena.servicesecurity.DTO.IModuleDto;
import com.sena.servicesecurity.Entity.Module;

public interface IModuleService extends IBaseService<Module>{
	List<IModuleDto> getList();

}

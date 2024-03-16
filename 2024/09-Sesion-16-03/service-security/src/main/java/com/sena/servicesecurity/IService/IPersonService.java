package com.sena.servicesecurity.Service.IService;

import java.util.List;

import com.sena.servicesecurity.DTO.IPersonDto;
import com.sena.servicesecurity.Entity.Person;

public interface IPersonService extends IBaseService<Person>{
	
	List<IPersonDto> getList();

}

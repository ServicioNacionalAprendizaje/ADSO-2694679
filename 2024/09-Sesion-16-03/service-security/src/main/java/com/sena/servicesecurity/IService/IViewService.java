package com.sena.servicesecurity.IService;

import java.util.List;

import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.View;

public interface IViewService extends IBaseService<View>{
	List<IViewDto> getList();
}

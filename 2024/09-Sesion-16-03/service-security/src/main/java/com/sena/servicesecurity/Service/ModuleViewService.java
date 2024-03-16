package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.servicesecurity.Entity.ModuleView;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IModuloViewRepository;
import com.sena.servicesecurity.IService.IModuleViewService;

@Service
public class ModuleViewService extends ABaseService<ModuleView> implements IModuleViewService{

	@Override
	protected IBaseRepository<ModuleView, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IModuloViewRepository repository;
}
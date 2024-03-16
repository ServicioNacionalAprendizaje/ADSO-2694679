package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IModuleViewDto;
import com.sena.servicesecurity.Entity.ModuleView;

@Repository
public interface IModuloViewRepository extends IBaseRepository<ModuleView, Long>{

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as module,"
			+ " route, "
			+ " description, "
			+ " state "
			+ "	FROM "
			+ "	module "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IModuleViewDto> getList();
}

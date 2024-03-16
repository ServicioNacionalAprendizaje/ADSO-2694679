package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.ModuleRole;

@Repository
public interface IModuloRoleRepository extends IBaseRepository<ModuleRole, Long>{

	
	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as view,"			
			+ " description, "
			+ " route, "
			+ " state "
			+ "	FROM "
			+ "	view "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
		List<IViewDto> getList();
	
}

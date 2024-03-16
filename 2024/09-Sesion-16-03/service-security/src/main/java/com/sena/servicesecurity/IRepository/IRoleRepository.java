package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IRoleDto;
import com.sena.servicesecurity.Entity.Role;

@Repository
public interface IRoleRepository extends IBaseRepository<Role, Long>{

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as role,"
			+ " description, "
			+ " state "
			+ "	FROM "
			+ "	role "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IRoleDto> getList();
	
	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as role,"
			+ " description, "
			+ " state "
			+ "	FROM "
			+ "	role "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<Object[]> getDList();
}

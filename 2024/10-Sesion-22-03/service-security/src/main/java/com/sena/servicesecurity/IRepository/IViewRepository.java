package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.View;

@Repository
public interface IViewRepository extends IBaseRepository<View, Long>{

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
	List<Object[]> getDList();
}

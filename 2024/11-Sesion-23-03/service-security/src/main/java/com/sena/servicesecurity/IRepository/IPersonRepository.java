package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IPersonDto;
import com.sena.servicesecurity.Entity.Person;


@Repository
public interface IPersonRepository extends IBaseRepository<Person, Long>{


		@Query(value = " SELECT  "
				+ " id, "
				+ " concat(first_name,'  ',last_name) as person "
				+ "	FROM  "
				+ "	person "
				+ "	WHERE  "
				+ " deleted_at IS NULL", nativeQuery = true)
		List<IPersonDto> getList();
		
		@Query(value = " SELECT  "
				+ " id, "
				+ " concat(first_name,'  ',last_name) as person "
				+ "	FROM  "
				+ "	person "
				+ "	WHERE  "
				+ " deleted_at IS NULL", nativeQuery = true)
		List<Object[]> getDList();
}

package com.sena.servicesecurity.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.DTO.IModuleDto;
import com.sena.servicesecurity.DTO.IUserDto;
import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.User;

@Repository
public interface IUserRepository extends IBaseRepository<User, Long> {

    @Query(value = "SELECT \r\n"
    		+ "    u.id, \r\n"
    		+ "    u.username AS username, \r\n"
    		+ "    CONCAT(p.first_name, ' ', p.last_name) AS personName, \r\n"
    		+ "    p.email AS personEmail, \r\n"
    		+ "    u.state,\r\n"
    		+ "    ur.role_id AS roleId -- Selecciona el ID del rol\r\n"
    		+ "FROM \r\n"
    		+ "    user u\r\n"
    		+ "INNER JOIN \r\n"
    		+ "    person p ON p.id = u.person_id\r\n"
    		+ "INNER JOIN \r\n"
    		+ "    user_role ur ON ur.user_id = u.id\r\n"
    		+ "INNER JOIN \r\n"
    		+ "    role r ON r.id = ur.role_id\r\n"
    		+ "WHERE \r\n"
    		+ "    u.username = :username AND u.password = :password\r\n"
    		+ "", nativeQuery = true)
    List<IUserDto> getUserWithRole(@Param("username") String username, @Param("password") String password);
    

    @Query(value = "SELECT v.id,  v.description, v.state, v.name, v.route, m.name AS module\r\n"
    		+ "FROM view AS v\r\n"
    		+ "INNER JOIN module_view AS mv ON mv.view_id = v.id\r\n"
    		+ "INNER JOIN module m ON mv.module_id = m.id\r\n"
    		+ "\r\n"
    		+ "INNER JOIN module_role AS mr ON mr.module_id = mv.module_id\r\n"
    		+ "\r\n"
    		+ "\r\n"
    		+ "WHERE mr.role_id =:roleId ", nativeQuery = true)
    List<IViewDto> getViewsByRoleId(@Param("roleId") Long roleId);
    
    
 

}

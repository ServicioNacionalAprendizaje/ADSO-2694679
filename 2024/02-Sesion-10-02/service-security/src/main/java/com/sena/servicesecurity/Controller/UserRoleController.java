package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.Entity.UserRole;
import com.sena.servicesecurity.IService.IUserRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/userRole")
public class UserRoleController extends ABaseController<UserRole,IUserRoleService>{
	public UserRoleController(IUserRoleService service) {
        super(service, "UserRole");
    }
}

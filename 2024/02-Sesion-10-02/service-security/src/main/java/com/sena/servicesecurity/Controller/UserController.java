package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.Entity.Person;
import com.sena.servicesecurity.Entity.User;
import com.sena.servicesecurity.IService.IPersonService;
import com.sena.servicesecurity.IService.IUserService;
import com.sena.servicesecurity.Service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends ABaseController<User,IUserService>{
	public UserController(IUserService service) {
        super(service, "User");
    }
}

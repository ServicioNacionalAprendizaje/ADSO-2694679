package com.sena.servicesecurity.Controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.DTO.ApiResponseDto;
import com.sena.servicesecurity.DTO.IUserDto;
import com.sena.servicesecurity.Entity.User;
import com.sena.servicesecurity.IService.IUserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends ABaseController<User,IUserService>{
	public UserController(IUserService service) {
        super(service, "User");
    }
	
	@GetMapping("/login")
    public ResponseEntity<ApiResponseDto<Optional<IUserDto>>> show(@RequestParam String username, @RequestParam String password) {
        try {
            Optional<IUserDto> entity = service.getLogin(username, password);
            return ResponseEntity.ok(new ApiResponseDto<Optional<IUserDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<Optional<IUserDto>>(e.getMessage(), null, false));
        }
    }
}

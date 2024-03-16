package com.sena.servicesecurity.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.DTO.ApiResponseDto;
import com.sena.servicesecurity.DTO.IRoleDto;
import com.sena.servicesecurity.Entity.Role;
import com.sena.servicesecurity.IService.IRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/role")
public class RoleController extends ABaseController<Role,IRoleService>{
	public RoleController(IRoleService service) {
        super(service, "Role");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IRoleDto>>> show() {
        try {
            List<IRoleDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IRoleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IRoleDto>>(e.getMessage(), null, false));
        }
    }
}

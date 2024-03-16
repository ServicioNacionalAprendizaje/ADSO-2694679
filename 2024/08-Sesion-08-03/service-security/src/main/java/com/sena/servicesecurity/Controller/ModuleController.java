package com.sena.servicesecurity.Controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.DTO.ApiResponseDto;
import com.sena.servicesecurity.DTO.IModuleDto;

import com.sena.servicesecurity.Entity.Module;
import com.sena.servicesecurity.IService.IModuleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Module,IModuleService>{
	public ModuleController(IModuleService service) {
        super(service, "Module");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IModuleDto>>> show() {
        try {
            List<IModuleDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IModuleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IModuleDto>>(e.getMessage(), null, false));
        }
    }
}

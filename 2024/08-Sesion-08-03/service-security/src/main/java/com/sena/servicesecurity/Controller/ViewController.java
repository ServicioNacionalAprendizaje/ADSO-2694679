package com.sena.servicesecurity.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.DTO.ApiResponseDto;
import com.sena.servicesecurity.DTO.IViewDto;
import com.sena.servicesecurity.Entity.View;
import com.sena.servicesecurity.IService.IViewService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/view")
public class ViewController extends ABaseController<View,IViewService>{
	public ViewController(IViewService service) {
        super(service, "View");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IViewDto>>> show() {
        try {
            List<IViewDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IViewDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IViewDto>>(e.getMessage(), null, false));
        }
    }
}

package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.Entity.ModuleView;
import com.sena.servicesecurity.IService.IModuleViewService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module-view")
public class ModuleViewController extends ABaseController<ModuleView,IModuleViewService>{
	public ModuleViewController(IModuleViewService service) {
        super(service, "ModuleView");
    }
}

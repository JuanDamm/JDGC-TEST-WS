package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Roles;
import com.sena.JDGC_TesT_WS.IService.RolesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController<Roles, RolesIService>{

	protected RolesController(RolesIService service) {
		super(service, "Roles");
		// TODO Auto-generated constructor stub
	}
	
	

}

package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Routes;
import com.sena.JDGC_TesT_WS.IService.RoutesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/routes")
public class RouteController extends ABaseController<Routes, RoutesIService>{

	protected RouteController(RoutesIService service) {
		super(service, "Routes");
		// TODO Auto-generated constructor stub
	}
	
	

}

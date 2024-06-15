package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.CabinType;
import com.sena.JDGC_TesT_WS.IService.CabinTypeIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabin_type")
public class CabinTypeController extends ABaseController<CabinType, CabinTypeIService>{

	protected CabinTypeController(CabinTypeIService service) {
		super(service, "CabinType");
		// TODO Auto-generated constructor stub
	}
	

}

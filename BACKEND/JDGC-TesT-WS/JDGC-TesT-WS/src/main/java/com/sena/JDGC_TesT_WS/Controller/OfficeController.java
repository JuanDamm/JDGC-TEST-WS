package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Offices;
import com.sena.JDGC_TesT_WS.IService.OfficesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Office")
public class OfficeController extends ABaseController<Offices, OfficesIService>{

	protected OfficeController(OfficesIService service) {
		super(service, "Offices");
		// TODO Auto-generated constructor stub
	}
	
	

}

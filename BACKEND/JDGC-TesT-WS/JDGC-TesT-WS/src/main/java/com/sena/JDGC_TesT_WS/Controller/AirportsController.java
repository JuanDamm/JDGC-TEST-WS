package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Airports;
import com.sena.JDGC_TesT_WS.IService.AirportsIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController<Airports, AirportsIService>{

	protected AirportsController(AirportsIService service) {
		super(service, "Airports");
		// TODO Auto-generated constructor stub
	}

}

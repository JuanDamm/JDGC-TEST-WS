package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Aircraft;
import com.sena.JDGC_TesT_WS.IService.AircraftIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/aircraft")
public class AircraftController extends ABaseController<Aircraft, AircraftIService>{


	protected AircraftController(AircraftIService service) {
		super(service, "Aircraft");
	}

}

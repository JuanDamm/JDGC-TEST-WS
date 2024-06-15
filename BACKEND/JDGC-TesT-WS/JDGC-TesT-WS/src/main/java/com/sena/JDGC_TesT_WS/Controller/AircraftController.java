package com.sena.JDGC_TesT_WS.Controller;

import com.sena.JDGC_TesT_WS.Entity.Aircraft;
import com.sena.JDGC_TesT_WS.IService.AircraftIService;

public class AircraftController extends ABaseController<Aircraft, AircraftIService>{


	protected AircraftController(AircraftIService service) {
		super(service, "Aircraft");
	}

}

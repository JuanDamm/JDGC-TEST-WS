package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Countries;
import com.sena.JDGC_TesT_WS.IService.CountriesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController<Countries, CountriesIService>{

	protected CountriesController(CountriesIService service) {
		super(service, "Countries");
		// TODO Auto-generated constructor stub
	}
	
	

}

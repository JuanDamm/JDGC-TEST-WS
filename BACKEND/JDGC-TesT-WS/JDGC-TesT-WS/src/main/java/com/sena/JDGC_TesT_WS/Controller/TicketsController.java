package com.sena.JDGC_TesT_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Tickets;
import com.sena.JDGC_TesT_WS.IService.TicketsIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController<Tickets, TicketsIService>{

	protected TicketsController(TicketsIService service) {
		super(service, "Tickets");
		// TODO Auto-generated constructor stub
	}

}

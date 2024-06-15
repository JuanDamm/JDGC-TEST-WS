package com.sena.JDGC_TesT_WS.Controller;


import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.JDGC_TesT_WS.Entity.Schedules;
import com.sena.JDGC_TesT_WS.IService.SchedulesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class ScheduleController extends ABaseController<Schedules, SchedulesIService> {



    
	
    protected ScheduleController(SchedulesIService service) {
        super(service, "Schedules");
    }
    @GetMapping("/buscar")
    public List<Schedules> encontrarFechaYRuta(Date date, Long departureAirportId, Long arrivalAirportId) {
        return service.encontrarFechaYRuta(date, departureAirportId, arrivalAirportId);
    }
   
}

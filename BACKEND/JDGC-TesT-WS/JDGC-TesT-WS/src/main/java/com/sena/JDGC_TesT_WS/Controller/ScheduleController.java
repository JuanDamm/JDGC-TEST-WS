package com.sena.JDGC_TesT_WS.Controller;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Schedules> encontrarFechaYRuta(
            @RequestParam(value = "date", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
            @RequestParam(value = "startDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam(value = "endDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
            @RequestParam(value = "departureAirportId", required = false) Long departureAirportId,
            @RequestParam(value = "arrivalAirportId", required = false) Long arrivalAirportId,
            @RequestParam(value = "visualizarTresDias", defaultValue = "false") boolean visualizarTresDias) {

        if (startDate == null && endDate == null) {
            startDate = date;
            endDate = date;
        }

        if (visualizarTresDias) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date != null ? date : startDate);
            cal.add(Calendar.DATE, -3);
            Date fechaInicio = cal.getTime();
            cal.add(Calendar.DATE, 6);
            Date fechaFin = cal.getTime();
            return service.encontrarFechasYRuta(fechaInicio, fechaFin, departureAirportId, arrivalAirportId);
        } else {
            return service.encontrarFechasYRuta(startDate, endDate, departureAirportId, arrivalAirportId);
        }
    }
}

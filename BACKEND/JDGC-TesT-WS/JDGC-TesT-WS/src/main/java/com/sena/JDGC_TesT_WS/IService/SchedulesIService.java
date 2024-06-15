package com.sena.JDGC_TesT_WS.IService;

import java.util.Date;
import java.util.List;

import com.sena.JDGC_TesT_WS.Entity.Schedules;

public interface SchedulesIService extends IBaseService<Schedules> {
	
	List<Schedules> encontrarFechaYRuta(Date date, Long departureAirportId, Long arrivalAirportId);

}

package com.sena.JDGC_TesT_WS.IRepository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.JDGC_TesT_WS.Entity.Schedules;

@Repository
public interface SchedulesIRepository extends IBaseRepository<Schedules, Long>{
	
	@Query("SELECT s FROM Schedules s WHERE s.date = :date AND s.routesID.departureAirport.id = :departureAirportId AND s.routesID.arrivalAirport.id = :arrivalAirportId")
	List<Schedules> encontrarFechaYRuta(@Param("date") Date date, @Param("departureAirportId") Long departureAirportId, @Param("arrivalAirportId") Long arrivalAirportId);

}

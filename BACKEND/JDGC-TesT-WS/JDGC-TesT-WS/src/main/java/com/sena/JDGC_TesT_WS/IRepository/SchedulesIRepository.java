package com.sena.JDGC_TesT_WS.IRepository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.JDGC_TesT_WS.Entity.Schedules;

@Repository
public interface SchedulesIRepository extends IBaseRepository<Schedules, Long>{
	
	@Query("SELECT s FROM Schedules s WHERE s.date = :date " +
		       "AND (:departureAirportId IS NULL OR s.routesID.departureAirport.id = :departureAirportId) " +
		       "AND (:arrivalAirportId IS NULL OR s.routesID.arrivalAirport.id = :arrivalAirportId)")
		List<Schedules> encontrarFechaYRuta(
		    @Param("date") Date date,
		    @Param("departureAirportId") Long departureAirportId,
		    @Param("arrivalAirportId") Long arrivalAirportId
		);

	@Query("SELECT s FROM Schedules s WHERE (s.date BETWEEN :startDate AND :endDate) " +
		       "AND (:departureAirportId IS NULL OR s.routesID.departureAirport.id = :departureAirportId) " +
		       "AND (:arrivalAirportId IS NULL OR s.routesID.arrivalAirport.id = :arrivalAirportId)")
		List<Schedules> encontrarFechasYRuta(
		    @Param("startDate") Date startDate,
		    @Param("endDate") Date endDate,
		    @Param("departureAirportId") Long departureAirportId,
		    @Param("arrivalAirportId") Long arrivalAirportId
		);

}

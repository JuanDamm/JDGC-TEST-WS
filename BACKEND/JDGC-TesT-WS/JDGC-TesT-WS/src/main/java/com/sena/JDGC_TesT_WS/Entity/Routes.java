package com.sena.JDGC_TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Routes")
public class Routes extends ABaseEntity{
	
	@Column(name = "distance", nullable = false)
	private Double distance;
	
	@Column(name = "flightTime", nullable = false)
	private Integer flightTime;
	
	@ManyToOne(fetch =  FetchType.EAGER, optional = false)
	 @JoinColumn(name = "departureAirportId")
	 private Airports departureAirport;
	
	@ManyToOne(fetch =  FetchType.EAGER, optional = false)
	 @JoinColumn(name = "arrivalAirportId")
	 private Airports arrivalAirport;

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Integer flightTime) {
		this.flightTime = flightTime;
	}

	public Airports getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airports departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airports getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airports arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	
	

}

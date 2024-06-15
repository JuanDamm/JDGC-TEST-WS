package com.sena.JDGC_TesT_WS.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Schedubles")
public class Schedules extends ABaseEntity{
	
	@Column(name = "date", nullable = false)
	private Date date;
	
	@Column(name = "time", nullable = false)
	private Double time;
	
	@Column(name = "economyPrice", nullable = false)
	private Double economyPrice;
	
	@Column(name = "confurmed", nullable = false)
	private String confurmed;
	
	@Column(name = "flightNumber", nullable = false)
	private Integer flightNumber;
	
	@ManyToOne(fetch =  FetchType.EAGER, optional = false)
	 @JoinColumn(name = "aircraftID")
	 private Aircraft aircraftID;
	
	@ManyToOne(fetch =  FetchType.EAGER, optional = false)
	 @JoinColumn(name = "routesID")
	 private Routes routesID;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Double getEconomyPrice() {
		return economyPrice;
	}

	public void setEconomyPrice(Double economyPrice) {
		this.economyPrice = economyPrice;
	}

	public String getConfurmed() {
		return confurmed;
	}

	public void setConfurmed(String confurmed) {
		this.confurmed = confurmed;
	}

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Aircraft getAircraftID() {
		return aircraftID;
	}

	public void setAircraftID(Aircraft aircraftID) {
		this.aircraftID = aircraftID;
	}

	public Routes getRoutesID() {
		return routesID;
	}

	public void setRoutesID(Routes routesID) {
		this.routesID = routesID;
	}
	
	
	


}

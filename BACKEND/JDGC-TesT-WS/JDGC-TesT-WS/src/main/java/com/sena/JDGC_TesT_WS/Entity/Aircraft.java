package com.sena.JDGC_TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aircraft")
public class Aircraft extends ABaseEntity{
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "makeModel", nullable = false)
	private String makeModel;
	@Column(name = "totalSeats", nullable = false)
	private Integer totalSeats;
	@Column(name = "economySeats", nullable = false)
	private String economySeats;
	@Column(name = "bussinessSeats", nullable = false)
	private String bussinessSeats;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMakeModel() {
		return makeModel;
	}
	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}
	public Integer getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(String economySeats) {
		this.economySeats = economySeats;
	}
	public String getBussinessSeats() {
		return bussinessSeats;
	}
	public void setBussinessSeats(String bussinessSeats) {
		this.bussinessSeats = bussinessSeats;
	}
	
	

}

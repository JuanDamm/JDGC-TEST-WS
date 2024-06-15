package com.sena.JDGC_TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Airports")
public class Airports extends ABaseEntity{
	
	 @Column(name = "IATAcode", nullable = false)
	 private String iata_code;
	 
	 @Column(name = "name", nullable = false)
	 private String name;
	 
	 @ManyToOne(fetch =  FetchType.EAGER, optional = false)
	 @JoinColumn(name = "countryID")
	 private Countries countries;

	public String getIata_code() {
		return iata_code;
	}

	public void setIata_code(String iata_code) {
		this.iata_code = iata_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}
	 	 
}

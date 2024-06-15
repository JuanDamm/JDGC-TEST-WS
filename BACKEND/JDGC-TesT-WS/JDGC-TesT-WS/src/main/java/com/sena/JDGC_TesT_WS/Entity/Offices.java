package com.sena.JDGC_TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Offices")
public class Offices extends ABaseEntity{

	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "phone", nullable = false)
    private String phone;
	@Column(name = "contact", nullable = false)
    private String contact;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "country_id")
    private Countries countryId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Countries getCountryId() {
		return countryId;
	}

	public void setCountryId(Countries countryId) {
		this.countryId = countryId;
	}
    
    
}

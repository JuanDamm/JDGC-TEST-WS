package com.sena.JDGC_TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Tickets extends ABaseEntity{
	
	 @Column(name = "firstname", nullable = false)
	    private String firstname;

	    @Column(name = "lastname", nullable = false)
	    private String lastname;

	    @Column(name = "email", nullable = true)
	    private String email;

	    @Column(name = "phone", nullable = false)
	    private String phone;

	    @Column(name = "passport_number", nullable = false)
	    private String passportNumber;
	    
	    @Column(name = "passport_country_id", nullable = false)
	    private Long passportCountryId; //COMENTADO PORQUE NO TENGO IDEA DE CON QUÉ QUE VA ESTO

	    @Column(name = "passport_photo", nullable = false)
	    private String passportPhoto;

	    @Column(name = "booking_reference", nullable = false)
	    private String bookingReference;

	    @Column(name = "confirmed", nullable = false)
	    private Boolean confirmed;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "schedule_id")
	    private Schedules schedule;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "cabin_type_id")
	    private CabinType cabinType;

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPassportNumber() {
			return passportNumber;
		}

		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}

		

		public String getPassportPhoto() {
			return passportPhoto;
		}

		public void setPassportPhoto(String passportPhoto) {
			this.passportPhoto = passportPhoto;
		}

		public String getBookingReference() {
			return bookingReference;
		}

		public void setBookingReference(String bookingReference) {
			this.bookingReference = bookingReference;
		}

		public Boolean getConfirmed() {
			return confirmed;
		}

		public void setConfirmed(Boolean confirmed) {
			this.confirmed = confirmed;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Schedules getSchedule() {
			return schedule;
		}

		public void setSchedule(Schedules schedule) {
			this.schedule = schedule;
		}

		public CabinType getCabinType() {
			return cabinType;
		}

		public void setCabinType(CabinType cabinType) {
			this.cabinType = cabinType;
		}
	    
	    

}

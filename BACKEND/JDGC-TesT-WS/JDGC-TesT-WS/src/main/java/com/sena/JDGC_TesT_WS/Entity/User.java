package com.sena.JDGC_TesT_WS.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USer")
public class User extends ABaseEntity{
		
		@Column(name = "email", nullable = false)
	    private String email;
		@Column(name = "password", nullable = false)
	    private String password;
		@Column(name = "firstName", nullable = false)
	    private String firstName;
		@Column(name = "lastName", nullable = false)
	    private String lastName;
		@Column(name = "birthDate", nullable = false)
	    private Date birthDate;
		@Column(name = "active", nullable = false)
	    private Boolean active;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "role_id")
	    private Roles role;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "office_id")
	    private Offices office;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}

		public Boolean getActive() {
			return active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public Roles getRole() {
			return role;
		}

		public void setRole(Roles role) {
			this.role = role;
		}

		public Offices getOffice() {
			return office;
		}

		public void setOffice(Offices office) {
			this.office = office;
		}
	    
	    

}

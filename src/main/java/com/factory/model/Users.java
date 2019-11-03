package com.factory.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {
	@Id
	private Long id;
	@NotBlank(message = "User Name cannot be empty")
	private String userName;
	@NotBlank(message = "Password cannot be empty")
	private String password;
	@NotBlank(message = "First Name cannot be empty")
	private String firstName;
	@NotBlank(message = "Last Name cannot be empty")
	private String lastName;
	private String middleName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	@Pattern(regexp = "\\d{5}(\\d{4})?", message = "Zip Code must be numeric and either 5 or 9 characters.")
	private String zip;
	private String fax;
	private String phone;
	@NotBlank(message = "Email cannot be empty")
	private String email;
	private String loggedOnce;
	private Integer accessAll;
	private Integer timeoutConter;
	private String userPreferences;
	private String authPass;
	@Temporal(value = TemporalType.DATE)
	private Date passwordcreatedDate;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean enabled;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean accountNonExpired;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean accountNonLocked;
	@Column(columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean credentialsNonExpired;
	
}

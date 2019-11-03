package com.factory.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {

	private Long id;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	@NotBlank(message = "User Name cannot be empty")
	@Size(max = 25, message = "User Name maximum  25 characters")
	private String userName;
	@Size(max = 500, message = "Password maximum 500 characters")
	private String password;
	@Pattern(regexp = "[a-z,A-Z]*", message = "First Name should be in Alphabets")
	@NotBlank(message = "First Name cannot be empty")
	@Size(max = 255, message = "First Name maximum 255 characters")
	private String firstName;
	@Pattern(regexp = "[a-z,A-Z]*", message = "Last Name should be in Alphabets")
	@NotBlank(message = "Last Name cannot be empty")
	@Size(max = 255, message = "Last Name maximum 255 characters")
	private String lastName;
	@Pattern(regexp = "[a-z,A-Z]*", message = "Middle Name should be in Alphabets")
	@Size(max = 25, message = "Middle Name maximum 25 characters")
	private String middleName;
	@Size(max = 255, message = "Address1 maximum 255 characters")
	private String address1;
	@Size(max = 255, message = "Address2 maximum 255 characters")
	private String address2;
	@Size(max = 50, message = "City maximum 50 characters")
	private String city;
	@Size(max = 50, message = "State maximum 50 characters")
	private String state;
	@Size(max = 20, message = "Zip maximum 20 characters")
	@Pattern(regexp = "\\d{5}(\\d{4})?", message = "Zip Code must be numeric and either 5 or 9 characters.")
	private String zip;
	@Size(max = 20, message = "Fax maximum 20 characters")
	private String fax;
	@Size(max = 20, message = "Phone maximum 20 characters")
	private String phone;
	@NotBlank(message = "Email cannot be empty")
	@Email(message = "Invalid Email Format")
	@Size(max = 255, message = "Email maximum 255 characters")
	private String email;
	private String loggedOnce;
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

	private String oldPassword;
	private String newPassword;
	private String confirmPassword;

}

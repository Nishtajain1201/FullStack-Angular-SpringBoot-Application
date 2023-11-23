package net.assignment3.springboot.model;
import java.util.*;

import jakarta.persistence.*;

//JPA Entity annotation to indicate that this class is an entity
@Entity

//JPA Table annotation to specify the name of the database table

@Table(name = "student")
public class student {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "street_Address")
	private String streetAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zip")
	private String zip;  
	
	@Column(name = "telephone_Number")
	private String telephoneNumber;
	
	@Column(name = "date_Of_Survey")
	private String dateOfSurvey;
	
	@Column(name = "likes")
	private List<String> likes;
	 
	@Column(name = "interest")
	private String interest;
	 
	@Column(name = "recommendation")
	private String recommendation;
	 
	@Column(name = "comments")
	private String comments;
	
	public student()
	{
		
	}
	// Parameterized constructor for creating instances with specific attribute values
	public student(long id, String firstName, String lastName, String streetAddress, String city, 
			String state, String zip, String telephoneNumber, String emailId, String dateOfSurvey, 
			List<String> likes, String interest, String recommendation, String comments) {
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.streetAddress = streetAddress;
	    this.city = city;
	    this.state = state;
	    this.zip = zip;
	    this.telephoneNumber = telephoneNumber;
	    this.emailId = emailId;
	    this.dateOfSurvey = dateOfSurvey;
	    this.likes = likes;
	    this.interest = interest;
	    this.recommendation = recommendation;
	    this.comments = comments;
	}
	// Getter and setter methods for accessing and modifying private attributes
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

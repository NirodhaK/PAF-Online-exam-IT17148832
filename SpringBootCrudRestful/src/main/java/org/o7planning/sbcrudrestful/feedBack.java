package org.o7planning.sbcrudrestful;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;



@XmlRootElement
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "feedback")
@Component
public class feedBack implements Serializable{
	
	private static final long serialVersionUID = 12345 ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int feedbackID;
	@Email
	private String email;
	private String cusName;
	private String description;
	public feedBack() {
		// TODO Auto-generated constructor stub
	
	}
	public int getFeedbackID() {
		return feedbackID;
	}
	public void setFeedbackID(int feedbackID) {
		this.feedbackID = feedbackID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

package com.example.eDoc.rest.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WniosekDto {

	private int id;
	private int pacjentId;
	private String symptoms;
	private String previousMeds;
	private boolean infectious;
	private Date sendDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPacjentId() {
		return pacjentId;
	}
	public void setPacjentId(int pacjentId) {
		this.pacjentId = pacjentId;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getPreviousMeds() {
		return previousMeds;
	}
	public void setPreviousMeds(String previousMeds) {
		this.previousMeds = previousMeds;
	}
	public boolean isInfectious() {
		return infectious;
	}
	public void setInfectious(boolean infectious) {
		this.infectious = infectious;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
	
}

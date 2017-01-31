package com.example.eDoc.model;

import java.util.Date;

public class Wniosek implements IHaveId{
	
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
	public int getPacjentId(){
	    return pacjentId;
    }
    public void setPacjentId (int pacjentId){
	    this.pacjentId = pacjentId;
    }
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public boolean isInfectious() {
		return infectious;
	}
	public void setInfectious(boolean infectious) {
		this.infectious = infectious;
	}
	public String getPreviousMeds() {
		return previousMeds;
	}
	public void setPreviousMeds(String previousMeds) {
		this.previousMeds = previousMeds;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
    
    
}

package com.example.eDoc.rest.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WiadomoscDto {
	
	private int id;
	private int fromPacjent;
	private int toPacjent;
	private int fromLekarz;
	private int toLekarz;
	private String title;
	private String content;
	private Date sendDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFromPacjent() {
		return fromPacjent;
	}
	public void setFromPacjent(int fromPacjent) {
		this.fromPacjent = fromPacjent;
	}
	public int getToPacjent() {
		return toPacjent;
	}
	public void setToPacjent(int toPacjent) {
		this.toPacjent = toPacjent;
	}
	public int getFromLekarz() {
		return fromLekarz;
	}
	public void setFromLekarz(int fromLekarz) {
		this.fromLekarz = fromLekarz;
	}
	public int getToLekarz() {
		return toLekarz;
	}
	public void setToLekarz(int toLekarz) {
		this.toLekarz = toLekarz;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	

}

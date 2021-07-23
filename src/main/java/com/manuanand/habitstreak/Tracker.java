package com.manuanand.habitstreak;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Tracker {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Date date;

	private int habitId;
	
	private int numSessions;
	
	private String notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHabitId() {
		return habitId;
	}

	public void setHabitId(int habitId) {
		this.habitId = habitId;
	}

	public int getNumSessions() {
		return numSessions;
	}

	public void setNumSessions(int numSessions) {
		this.numSessions = numSessions;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}

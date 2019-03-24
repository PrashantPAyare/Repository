package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SaveData {
	@Id
	private String name;
	private String teamName;
	private String teamUpdates;
	private Date createdDateTime;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamUpdates() {
		return teamUpdates;
	}
	public void setTeamUpdates(String teamUpdates) {
		this.teamUpdates = teamUpdates;
	}
	
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date date) {
		this.createdDateTime = date;
	}
	
	
}

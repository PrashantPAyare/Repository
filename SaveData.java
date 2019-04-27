package model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status")
public class SaveData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id",unique=true, nullable = false)
	private int id;
	private String username;
	private String teamName;
	private String teamUpdates;
	private Date createdDateTime;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
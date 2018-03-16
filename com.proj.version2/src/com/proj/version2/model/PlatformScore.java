package com.proj.version2.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="platform_score")
public class PlatformScore {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId;
	private Integer sourceId;
	private Date time;
	private String sourceName;
	
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}

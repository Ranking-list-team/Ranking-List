package com.proj.version2.model;

import javax.persistence.*;


@Entity
@Table(name="source")
public class Source {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String sourceName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	

}

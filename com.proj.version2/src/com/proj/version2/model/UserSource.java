package com.proj.version2.model;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="user_source")
public class UserSource {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId;
	private Integer sourceId;
	private Date signUpDate;
	private Integer fans;
	private Integer articles;
	private Integer likes;
	private Integer forward;
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
	public Date getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}
	public Integer getFans() {
		return fans;
	}
	public void setFans(Integer fans) {
		this.fans = fans;
	}
	public Integer getArticles() {
		return articles;
	}
	public void setArticles(Integer articles) {
		this.articles = articles;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getForward() {
		return forward;
	}
	public void setForward(Integer forward) {
		this.forward = forward;
	}
	
	
}
